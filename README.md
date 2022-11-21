# BookStore

## Functionalities

### GetBook 
--- 
`
@GetMapping("/getBook/{id}")
`
Get a book by its id(isbn)
---

### AddBook
---
```
@PostMapping("/addBook")
```
Adding a book by passing book as a json object
---

### Update Book
---
```
@PostMapping("/saveBook")
```
Saving a book by passing book as a json object

### DeleteBook
---
```
@PostMapping("/deleteBook")
```
Delete a book via isbn number and passing in user object as json for checking authorisation for deletion.
---

### ListBook
---
```
@PostMapping("/listBook")
```
Grabbing a book via title / author.
---
