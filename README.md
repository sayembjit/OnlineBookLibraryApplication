# Online Book Library Application

The Online Book Library Application is a backend-only web application built with Spring Boot, Spring Security, JPA, Hibernate and MySQL. It offers a comprehensive set of RESTful APIs for managing users, books, book borrowing, reservations, reviews, and more. This README provides an overview of the application's features, setup instructions, and usage guidelines.

## Features

### User Management

1. **User Registration**: Users can create accounts by providing their first name, last name, email, password, and address.

2. **User Login**: Registered users can log in using their email and password to obtain a JWT token for accessing secured endpoints.

3. **User Details**: Retrieve user details by user ID. Only users with the `ADMIN` role have access to this API.

4. **User's Books**: Retrieve the books owned or borrowed by a specific user. Accessible by both users and admins.

5. **User's Borrowed Books**: Retrieve the books currently borrowed by a specific user. Accessible by both users and admins.

### Books Management

1. **Add Books**: Administrators can add new books to the database, including book title, author, genre, and availability status.

2. **Update Books**: Administrators can update the details of existing books, including title, author, genre, and availability.

3. **Delete Books**: Administrators can remove books from the database.

4. **Fetch All Books**: Retrieve a list of all books stored in the database. Accessible by users with `ADMIN` or `CUSTOMER` roles.

### Book Borrowing/Returning

1. **Borrow Books**: Users can borrow books by providing the book ID. The application tracks book availability and due dates.

2. **Return Books**: Users can return borrowed books by providing the book ID. The application updates the book's status accordingly.

### Book Reservation 

1. **Reserve Books**: Users can reserve books that are currently unavailable. The application notifies users when reserved books become available.

2. **Cancel Reservations**: Users can cancel their book reservations, updating the reservation status accordingly.

### Book Reviews and Ratings

1. **Retrieve Reviews and Ratings**: Get reviews and ratings for a specific book by book ID.

2. **Create Reviews and Ratings**: Users can create reviews and ratings for books they have read.

3. **Update Reviews and Ratings**: Users can update their own reviews and ratings for a book.

4. **Delete Reviews and Ratings**: Users can delete their own reviews and ratings for a book.

### User History 

1. **Borrowing History**: Users can view their borrowing history, including borrowed books, due dates, and return dates.

## Getting Started

Follow these steps to set up and run the application on your local machine:

1. Clone the repository: git clone git@github.com:sayembjit/OnlineBookLibraryApplication.git

2. Configure the Database: Set up your MySQL database by modifying the `src/main/resources/application.properties` file with your database credentials.

3. Run the Application: Start the application using your preferred IDE or by running the following command in the project root directory:
4. 
4. Access the API: Once the application is running, you can access the API endpoints by making HTTP requests to the appropriate URLs.

## API Documentation

For detailed API documentation, including request and response examples, please refer to the [API documentation](docs/API_DOCUMENTATION.md).

## Contributing

We welcome contributions to improve this project. If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Make your changes and commit them (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature-name`).
5. Create a new pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.


