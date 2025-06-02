Testes Automatizados de API com Java + Rest Assured
Este projeto tem como objetivo validar endpoints de uma API de exemplo utilizando Java, Rest Assured e JUnit 5, com geração de relatório visual via Allure Report.

Objetivos da Avaliação
Tarefa 1:
Criar testes para um endpoint de exemplo, com validações de:

Status code
Headers
Corpo da resposta (body)
Tarefa 2:
Automatizar testes de múltiplos endpoints com diferentes métodos HTTP - TestGetPosts, TestPostCreate, TestPutUpdate e TestDeletePost, 400 (BadRequest) 401 (Unauthorized), 403 (Forbiden), 404 (NotFound) e 500 (Server Error) validando:

Status codes esperados
Headers relevantes
Estrutura e conteúdo do corpo da resposta
Relatório:
Relatório visual detalhado com os resultados da execução dos testes.

🛠️ Tecnologias Utilizadas
Java 11
Apache Maven
Rest Assured 5.3.1
JUnit 5
Allure Report

🚀 Como Executar os Testes
Clone o repositório ou copie os arquivos para sua máquina:
git clone https://github.com/BrunoNasc92/TesteAPI_Teste2.git
cd teste-api

Compile e execute:
mvn clean test

Relatório:
allure serve target/allure-results

Utilizamos a API pública https://reqres.in, ideal para simulação de testes com métodos GET, POST, PUT e DELETE.

👨‍💻 Autor
Bruno Nascimento
QA Sênior | Automação de Testes