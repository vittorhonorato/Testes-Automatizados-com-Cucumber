# 🧪 Testes Automatizados com Cucumber

Este repositório demonstra e pratica **testes automatizados de aceitação** utilizando **Java**, **Maven** e **Cucumber** seguindo a abordagem **BDD (Behavior-Driven Development)**.  

---

## 📂 Estrutura do Projeto

- `src/main` → Código-fonte principal da aplicação.  
- `src/test` → Testes automatizados com **Cucumber**, **Gherkin** e **JUnit**.  
- `pom.xml` → Gerenciamento de dependências com **Maven**.  
- `.github/workflows` → *(Opcional)* Workflows de **CI/CD** com GitHub Actions.  
- `.gitignore` e `.gitattributes` → Configurações de versionamento com Git.  

---

## ⚙️ Tecnologias Utilizadas

- **Java 17+**  
- **Spring Boot**  
- **JUnit 5**  
- **Cucumber**  
- **Maven**  

---

## 🚀 Pré-requisitos

Antes de executar os testes, certifique-se de ter instalado:  

- [Java JDK](https://adoptium.net/) (versão 17 ou superior)  
- [Maven](https://maven.apache.org/)  

> 💡 Dica: você pode usar `./mvnw` para rodar o Maven sem precisar instalá-lo globalmente.  

---

## ▶️ Como Executar os Testes

Para rodar todos os testes automatizados:  

```bash
./mvnw test
# ou
mvn test
