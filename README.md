# Trading Signals Platform

A multi-generational backend system designed to simulate a real-world evolving codebase.

This project demonstrates how modern Java systems coexist with legacy code, cloud infrastructure, and multiple technologies.

---

## 🚀 Goals

- Showcase Java + Spring Boot backend development
- Simulate legacy and modern code interaction
- Demonstrate database evolution (in-memory → PostgreSQL)
- Introduce cloud-ready architecture (AWS concepts)
- Include multi-language components (Node.js, Python)

---

## 🧱 Tech Stack

- Java 17
- Spring Boot
- Maven
- PostgreSQL (later stage)
- Docker
- AWS (conceptual integration)
- Node.js (supporting tools)
- Python (Lambda simulation)

---

## 📦 Project Structure

- `/backend` → Main Java application
- `/docker` → Local environment setup
- `/docs` → Architecture and engineering decisions

---

## ▶️ Getting Started

### Prerequisites

- Java 17+
- Maven 3+
- Docker (optional for later stages)

### Run locally

```bash
cd backend
mvn spring-boot:run
```

### Health check

```
GET http://localhost:8080/health
```

---

## 🧠 Philosophy

This project is intentionally built to evolve over time:

- Start simple (in-memory storage)
- Introduce complexity gradually
- Refactor and adapt legacy code
- Move toward cloud-native architecture

---

## 📌 Status

🚧 Phase 1 — Project bootstrap

---

## 📄 License

MIT