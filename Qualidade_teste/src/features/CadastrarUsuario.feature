#language:pt
Funcionalidade: Cadastrar usuários

  Contexto:
    Dado que o usuário acessou a modal Cadastrar Usuario

  Cenário: Salvar usuário com todos os campos
    Dado que o usuário preencheu os campos Nome, Nome da Mãe, CPF, Login, Senha
    Quando clicar em Salvar
    Então o usuário deve ser salvo com sucesso
    E deve apresentar a mensagem de feedback Usuário salvo com sucesso!
    E o usário deve ser apresentado na lista de usuários
    E a ação dece ser registrada ma auditoria

  Esquema do Cenário: Os campos Nome, Login e Senha são obrigatórios
    Dado que o usuário não preencheu <campo>
    Quando clicar em Salvar
    Então deve apresentar a mensagem de feedback informando que <campo><mensagem>
    Exemplos:
      |  campo                          | mensagem          |
      | o campo Nome                    | é obrigatório     |
      | o campo Login                   | é obrigatório     |
      | o campo Senha                   | é obrigatório     |
      | os campos Nome e Login          | são obrigatórios  |
      | os campos Nome e Senha          | são obrigatórios  |
      | os campos Login e Senha         | são obrigatórios  |
      | os campos Nome, Login e Senha   | são obrigatórios  |


  Esquema do Cenário: Os campos Nome, Nome da Mãe tem range de 256 carqacteres
    Dado que o usuário tente preencher <campo> com 257 caracteres
    Quando digitar o 257º caracter
    Então deve apresentar a mensagem de feedback informando que <campo><mensagem>
    Exemplos:
      |  campo                          | mensagem                           |
      | o campo Nome                    | tem o limite de 256 caracteres     |
      | o campo Nome da Mãe             | tem o limite de 256 caracteres     |


  Esquema do Cenário: O campo CPF deverá ser válido
    Dado que o usuário preencheu o campo CPF com menos que 15 caractres
    Quando clicar em outro campo
    Então deve apresentar a mensagem de feedback informando que CPF não está valido
    Exemplos:
      |CPF não é valido|


  Esquema do Cenário: O campo login deve aceitar no máximo 100 caracteres
    Dado que o usuário tente preencher login com 101 caracteres
    Quando digitar o 101º caracter
    Então deve apresentar a mensagem de feedback informando que o campo login permite 101 caracteres
    Exemplos:
      |O campo Login deverá ter até 100 caracteres|


  Esquema do Cenário: A senha deve ser formada por pelo menos um carácter especial,por pelo menos uma letra maiúscula e no máximo 8 caracteres
    Dado que o usuário tente preencher o campo senha sem caracter especial
    Quando digitar o ultimo caracter
    Então deve apresentar a mensagem de feedback informando que o campo senha deve conter pelo menos um carácter especial,por pelo menos uma letra maiúscula
    Exemplos:
      |O campo Senha deverá conter pelo menos um carácter especial,por pelo menos uma letra maiúscula |


  Esquema do Cenário: Os campos Nome, Login e Senha são obrigatórios
    Dado que o usuário não preencheu <campo>
    Quando clicar em Salvar
    Então deve apresentar a mensagem de feedback informando que <campo><mensagem>
    Exemplos:
      |  campo                          | mensagem          |
      | o campo Nome                    | é obrigatório     |
      | o campo Login                   | é obrigatório     |
      | o campo Senha                   | é obrigatório     |
      | os campos Nome e Login          | são obrigatórios  |
      | os campos Nome e Senha          | são obrigatórios  |
      | os campos Login e Senha         | são obrigatórios  |
      | os campos Nome, Login e Senha   | são obrigatórios  |

