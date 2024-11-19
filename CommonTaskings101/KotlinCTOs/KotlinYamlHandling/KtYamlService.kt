import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.DumperOptions
import java.io.File

// Data classes to represent our YAML structure
data class Server(
    var host: String = "",
    var port: Int = 0,
    var environment: String = "",
    var databases: List<Database> = listOf()
)

data class Database(
    var name: String = "",
    var type: String = "",
    var enabled: Boolean = false
)

class YamlHandler {
    private val yaml = Yaml()

    // Read YAML from string
    fun parseYamlString(yamlString: String): Server {
        return yaml.loadAs(yamlString, Server::class.java)
    }

    // Read YAML from file
    fun parseYamlFile(filePath: String): Server {
        val file = File(filePath)
        return yaml.loadAs(file.inputStream(), Server::class.java)
    }

    // Write object to YAML string
    fun writeToYamlString(server: Server): String {
        val options = DumperOptions().apply {
            defaultFlowStyle = DumperOptions.FlowStyle.BLOCK
            isPrettyFlow = true
        }
        return Yaml(options).dump(server)
    }

    // Write YAML to file
    fun writeToYamlFile(server: Server, filePath: String) {
        val yamlString = writeToYamlString(server)
        File(filePath).writeText(yamlString)
    }
}
