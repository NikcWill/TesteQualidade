#language:pt

Funcionalidade: Cadastrar usuario e acessar o site da empresa Nexxera Florianópolis


    Contexto:
        Dado que o usuário instanciou o chrome-driver

    @Questão1
    Esquema do Cenário: Preenchimento de cadastro

        Dado que o usuário prencheu os campos nome, sobrenome, sexo, comida preferida, escolaridade, esporte que pratica, sugestão
        Quando clicar em Cadastrar
        Então no campo <elementos> deverá retornar o formulário preenchido com as <informações>
        Exemplos:
         |  elementos          | informações  |
         | nome                | Jonh         |
         | sobrenome           | Kenedy       |
         | sexo                | 0            |
         | comida preferida    | 2            |
         | escolaridade        | superior     |
         | esporte que pratica | Corrida      |
         | sugestão            | Sugestão de mais feriados no ano! |

    @Questão2
    Esquema do Cenário: Os campos Nome, Sobrenome e Sexo são obrigatórios
        Dado que o usuário não preencheu <campo>
        Quando cadastrar
        Então deve apresentar a mensagem de feedback informando que <mensagem>
        Exemplos:
            |  campo                          | mensagem                  |
            | o campo Nome                    | Nome eh obrigatorio       |
            | o campo Sobrenome               | Sobrenome eh obrigatorio  |
            | o campo Sexo                    | Sexo eh obrigatorio       |
            | os campos Nome e Sobrenome      | Nome eh obrigatorio       |
            | os campos Nome e Sexo           | Nome eh obrigatorio       |
            | os campos Sobrenome e Sexo      | Sobrenome eh obrigatorio  |
            | os campos Nome, Sobrenome e Sexo| Nome eh obrigatorio       |



    @Questão3
    Cenário: Acessar Nexxera Florianópolis através de pesquisa google
        Dado que o usuário pesquisou pela empresa Nexxera Florianópolis no google
        E que retornou pesquisas relacionadas a empresa Nexxera Florianópolis
        Quando clicar no site da empresa Nexxera
        Então deve acessar o site da Nexxera

