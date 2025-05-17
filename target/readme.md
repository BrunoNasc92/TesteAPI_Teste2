Testes Automatizados de API com Java, Rest Assured, JUnit 5 e Allure


##Visão Geral
Este projeto realiza testes automatizados de API REST utilizando Java 11, o framework Rest Assured, JUnit 5 para orquestração dos testes, e Allure Reports para a geração de relatórios visuais e detalhados.
A API utilizada nos testes é a pública JSONPlaceholder, ideal para experimentação e prototipagem de testes em REST APIs.


##Tecnologias Utilizadas
Java 11
Maven
JUnit 5
Rest Assured 5.4.0
Allure JUnit 5 e Allure Rest-Assured
SLF4J (para logs)

##Estrutura do Projeto
src
├── test
    └── java
        └── br.com.api.testes
            └── ApiTests.java
pom.xml
README.md

##Executar os Testes
mvn clean test

##Gerar relatórios
allure serve allure-results

##Dependencias
O projeto utiliza as seguintes bibliotecas e ferramentas:

Dependência	              Versão	  Descrição
Java	                  11	      Linguagem principal para automação
Maven	                  3.8+	      Gerenciador de dependências e build
JUnit 5 (junit-jupiter)	  5.10.2	  Framework de testes
Rest Assured	          5.4.0	      Framework para automação de testes de API
Allure JUnit 5	          2.13.9	  Integração do Allure com JUnit 5
Allure Rest Assured	      2.13.9	  Integração do Allure para capturar logs do Rest Assured
Maven Surefire Plugin	  3.0.0-M9	  Plugin do Maven para execução dos testes
Allure Maven Plugin	      2.11.2	  Geração dos relatórios Allure

##Dica
Após clonar o projeto execute o mvn clean install que irá instalar todas as depencias


##Todos os testes incluem anotações do Allure como:
@Epic, @Feature, @Story
@Description para documentar cada caso
@Severity para indicar o impacto do teste


##Autor
Bruno S. Nascimento | QA Engineer | Automatação de Testes Backend/API