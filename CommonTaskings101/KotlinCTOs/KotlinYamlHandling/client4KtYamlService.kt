fun main() {
    // Example usage
    val yamlString = """
        host: localhost
        port: 8080
        environment: development
        databases:
          - name: users
            type: postgresql
            enabled: true
          - name: logs
            type: mongodb
            enabled: false
    """.trimIndent()

    val handler = YamlHandler()

    // Parse YAML string
    val server = handler.parseYamlString(yamlString)
    println("Parsed server: $server")

    // Modify the data
    server.port = 9000
    server.databases = server.databases.map { db ->
        if (db.name == "logs") db.copy(enabled = true) else db
    }

    // Write modified data back to YAML
    val newYaml = handler.writeToYamlString(server)
    println("\nModified YAML:")
    println(newYaml)

    // Example of writing to and reading from file
    handler.writeToYamlFile(server, "server-config.yml")
    val loadedServer = handler.parseYamlFile("server-config.yml")
    println("\nLoaded from file: $loadedServer")
}
