#language:pt

Funcionalidade: Cadastrar usuario e acessar o site da empresa Nexxera Florianópolis


    Contexto:
        Dado que o usuário instanciou o chrome-driver



    @Validar_formulario
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





    @acessar_site_nexxera
    Cenário: Acessar Nexxera Florianópolis através de pesquisa google
        Dado que o usuário pesquisou pela empresa Nexxera Florianópolis no google
        E que retornou pesquisas relacionadas a empresa Nexxera Florianópolis
        Quando clicar no site da empresa Nexxera
        Então deve acessar o site da Nexxera

