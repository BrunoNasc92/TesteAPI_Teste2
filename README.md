## Projeto de Testes Automatizados de API REST

Este repositório demonstra a implementação de testes automatizados para validação de uma API REST utilizando:

- **Java 11**
- **Rest Assured**
- **JUnit 5**
- **Allure Report**
- **GitHub Actions** (CI/CD)


## Objetivo

Automatizar a verificação de múltiplos endpoints de uma API de exemplo, cobrindo tanto cenários **positivos** quanto **negativos**, com geração de **relatórios visuais** e execução contínua via **CI/CD**.


## Tecnologias e Ferramentas

| Tecnologia      | Versão       |
|-----------------|--------------|
| Java            | 11           |
| Maven           | 3.9.x        |
| Rest Assured    | 5.4.0        |
| JUnit Jupiter   | 5.10.2       |
| Allure          | 2.13.9       |
| GitHub Actions  | CI/CD        |


## Estrutura dos Testes
src/test/java/br/com/api/testes/
├── ApiTest.java # Testes com POST, PUT e DELETE
├── ApiErrosTest.java # Testes simulando erros HTTP: 400, 401, 403, 404, 500

TesteAPI_Teste2/
├── .github/workflows/ci.yml # Pipeline GitHub Actions
├── pom.xml # Dependências Maven
├── src/test/java/... # Código dos testes
├── Evidencia/TesteAPI_Teste2.pdf # Evidência técnica em PDF

## Como executar localmente

1. Clone o projeto:

Bash:
clone https://github.com/BrunoNasc92/TesteAPI_Teste2.git
cd TesteAPI_Teste2

2. Execute os testes:
mvn clean test

3. Gere o relatório Allure localmente:
allure serve target/allure-results

Testes Implementados
✅ Cenários Positivos
Validação de retorno 200 OK e dados válidos da API https://reqres.in

Teste de GET, POST, PUT, DELETE com validação de corpo, status e headers

🚫 Cenários Negativos (Simulação de erros)
Utilizando https://httpstat.us para validar tratamento de:

| Código | Situação Simulada     |
| ------ | --------------------- |
| 400    | Bad Request           |
| 401    | Unauthorized          |
| 403    | Forbidden             |
| 404    | Not Found             |
| 500    | Internal Server Error |

CI/CD com GitHub Actions
A cada push ou pull request na branch main, a pipeline é executada automaticamente:
⚙️ Compila o projeto
🧪 Roda os testes com Maven
💾 Publica os artefatos do Allure (target/allure-results)

Veja a aba Actions do repositório para histórico de execuções.

 Evidência em PDF
 Clique aqui para visualizar o reltório em PDF


## Conclusão Técnica
A automação de testes foi conduzida com sucesso, validando os principais métodos HTTP e simulações de erros. O projeto está integrado ao GitHub Actions, o que permite rastreabilidade, repetibilidade e confiança no ciclo de entrega contínua (CI/CD).





