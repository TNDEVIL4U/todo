# 📋 Fullstack Todo Application (React + Spring Boot + MySQL)

A fullstack **Todo management application** built with **React (frontend)** and **Spring Boot (backend)**, using **MySQL** as the database. The app exposes **RESTful APIs** with **Spring Data JPA** and includes **JWT authentication & authorization** for secure access.

---

## 🚀 Features
- 🔐 User registration & login with JWT authentication  
- ✅ Create, read, update, and delete (CRUD) todos  
- 👥 Role-based access control (Admin/User)  
- 🌐 RESTful APIs for backend communication  
- 🎨 Responsive React UI for managing todos  
- 💾 Persistent storage with MySQL via JPA/Hibernate  

---

## 🛠️ Tech Stack
- **Frontend:** React, Axios, Bootstrap/Material UI  
- **Backend:** Spring Boot, Spring Security, JPA/Hibernate  
- **Database:** MySQL  
- **API:** RESTful endpoints  
- **Auth:** JWT-based authentication  

---

## 📂 Project Structure
```
todo-app/
│
├── backend/                # Spring Boot application
│   ├── src/main/java/...   # Controllers, Services, Repositories
│   ├── src/main/resources/ # application.properties
│   └── pom.xml             # Maven dependencies
│
├── frontend/               # React application
│   ├── src/                # Components, Pages, Services
│   ├── public/             # Static assets
│   └── package.json        # NPM dependencies
│
└── database/               # MySQL schema & migration scripts
```

---

## ⚙️ Installation & Setup

### 1️⃣ Backend (Spring Boot)
1. Navigate to the `backend/` folder  
2. Configure `application.properties` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   jwt.secret=yourSecretKey
   ```
3. Run the backend:
   ```bash
   mvn spring-boot:run
   ```

### 2️⃣ Frontend (React)
1. Navigate to the `frontend/` folder  
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the frontend:
   ```bash
   npm start
   ```
4. Access the app at: [http://localhost:3000](http://localhost:3000)

---

## 🔗 API Endpoints

| Method | Endpoint              | Description              |
|--------|-----------------------|--------------------------|
| POST   | `/api/auth/register`  | Register new user        |
| POST   | `/api/auth/login`     | Login & get JWT token    |
| GET    | `/api/todos`          | Get all todos (user)     |
| POST   | `/api/todos`          | Create new todo          |
| PUT    | `/api/todos/{id}`     | Update todo by ID        |
| DELETE | `/api/todos/{id}`     | Delete todo by ID        |

---

## 🔒 Authentication
- Uses **JWT tokens** for secure API access  
- Token must be included in the `Authorization` header:  
  ```
  Authorization: Bearer <your_token>
  ```
  
## 🤝 Contributing
1. Fork the repository  
2. Create a new branch (`feature/your-feature`)  
3. Commit your changes  
4. Push to your branch  
5. Open a Pull Request  

---

## 📜 License
This project is licensed under the MIT License.
