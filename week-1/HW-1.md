# Environment Setup Guide

## 1. Java Development Kit (JDK) 25 LTS
- Download JDK 25 LTS from Oracle website
- Choose appropriate version for your OS (Windows/macOS/Linux)
- Run installer and follow setup wizard
- Set JAVA_HOME environment variable
- Add JDK bin directory to PATH

## 2. Apache Maven
- Download latest Maven version from Apache website
- Extract to desired directory (e.g., C:\Maven or /opt/maven)
- Set M2_HOME environment variable
- Add M2_HOME/bin to PATH
- Verify installation: `mvn -version`

## 3. IntelliJ IDEA
- Download IntelliJ IDEA Community or Ultimate edition
- Run installer and follow installation steps
- Configure JDK 25 in Project Structure settings
- Install essential plugins:
  - Maven Integration
  - Git Integration
  - Database Tools
  - Markdown support

## 4. Git
- Download Git for your operating system
- Run installer with recommended settings
- Configure global settings:
  ```bash
  git config --global user.name "Your Name"
  git config --global user.email "your.email@example.com"
## 5. MySQL
- Download MySQL Community Server

- Run installer and follow setup wizard

- Configure root password and port (default: 3306)

- Install MySQL Workbench for GUI management

- Verify connection: mysql -u root -p

## 6. Draw.IO (Diagrams.net)
- Access online: https://app.diagrams.net/

- Or download desktop version

- No installation required for online version

- Useful for creating system architecture diagrams

## 7. Markdown with Mermaid UML
- Use any markdown editor (VS Code, IntelliJ, etc.)

- Install Mermaid support plugin/extensions

- For VS Code: Install "Markdown Preview Mermaid Support"

- For IntelliJ: Install "Mermaid.js integration" plugin
## 8. Verification of Installations
```
Verification Steps
Verify JDK: java -version

Verify Maven: mvn -version

Verify Git: git --version

Verify MySQL: mysql --version
```