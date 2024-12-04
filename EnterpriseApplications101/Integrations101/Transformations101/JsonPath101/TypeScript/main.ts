import jsonpath from 'jsonpath';

// Sample complex JSON object representing a library catalog
const libraryCatalog = {
  library: {
    name: "City Central Library",
    books: [
      {
        title: "The Great Gatsby",
        author: "F. Scott Fitzgerald",
        genres: ["Fiction", "Classic"],
        published: 1925,
        available: true
      },
      {
        title: "1984",
        author: "George Orwell",
        genres: ["Science Fiction", "Dystopian"],
        published: 1949,
        available: false
      },
      {
        title: "Pride and Prejudice",
        author: "Jane Austen",
        genres: ["Romance", "Classic"],
        published: 1813,
        available: true
      }
    ],
    departments: [
      { name: "Fiction", floor: 2 },
      { name: "Non-Fiction", floor: 3 }
    ]
  }
};

// Example JSONPath Queries
function demonstrateJsonPath() {
  // 1. Select all book titles
  const bookTitles = jsonpath.query(libraryCatalog, '$.library.books[*].title');
  console.log('All Book Titles:', bookTitles);
  // Expected: ['The Great Gatsby', '1984', 'Pride and Prejudice']

  // 2. Find books published before 1900
  const oldBooks = jsonpath.query(libraryCatalog, '$.library.books[?(@.published < 1900)]');
  console.log('Books Published Before 1900:', oldBooks);
  // Expected: [{ title: 'Pride and Prejudice', ... }]

  // 3. Select available books
  const availableBooks = jsonpath.query(libraryCatalog, '$.library.books[?(@.available == true)]');
  console.log('Available Books:', availableBooks);
  // Expected: Books with available: true

  // 4. Select first book's genres
  const firstBookGenres = jsonpath.query(libraryCatalog, '$.library.books[0].genres');
  console.log('First Book Genres:', firstBookGenres);
  // Expected: ['Fiction', 'Classic']

  // 5. Find books in Classic genre
  const classicBooks = jsonpath.query(libraryCatalog, '$.library.books[?(@.genres.includes("Classic"))]');
  console.log('Classic Books:', classicBooks);
  // Expected: Books with 'Classic' in genres
}

// Run the demonstration
demonstrateJsonPath();

// Helper function to demonstrate path selection
function selectWithJsonPath(obj: any, path: string) {
  return jsonpath.query(obj, path);
}

export { libraryCatalog, demonstrateJsonPath, selectWithJsonPath };
