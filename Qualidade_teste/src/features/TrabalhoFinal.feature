#language:pt

Funcionalidade: Cadastrar usuario e acessar o site da empresa Nexxera Florianópolis


    Contexto:
        Dado que o usuário instanciou o chrome-driver


    Esquema do Cenário: Validar os campos
        Quando o usuário preencher os <campo>
        E clicar em salvar
        Então o fomulário deverá retornar preenchido com <resultado>
        Exemplos:
            |campo |  resultado |


    @Validar_obrigatoriedade
    Esquema do Cenário: Os campos Nome, Sobrenome e Sexo são obrigatórios
        Dado que o usuário não preencheu <campo>
        Quando clicar em Salvar
        Então deve apresentar a mensagem de feedback informando que <campo><mensagem>
        Exemplos:
            |  campo                             | mensagem          |
            | o campo Nome                       | é obrigatório     |
            | o campo Sobrenome                  | é obrigatório     |
            | o campo Sexo                       | é obrigatório     |
            | os campos Nome e Sobrenome         | são obrigatórios  |
            | os campos Nome e Sexo              | são obrigatórios  |
            | os campos Sobrenome e Sexo         | são obrigatórios  |
            | os campos Nome, Sobrenome e Sexo   | são obrigatórios  |



    @acessar_site_nexxera
    Cenário: Acessar Nexxera Florianópolis através de pesquisa google
        Dado que o usuário pesquisou pela empresa Nexxera Florianópolis no google
        E que retornou pesquisas relacionadas a empresa Nexxera Florianópolis
        Quando clicar no site da empresa Nexxera
        Então deve acessar o site da Nexxera

