#language:pt
Funcionalidade: Acessar vários componentes html

    Contexto:
        Dado que o usuário acessou o arquivo Campo de Treinamento

    @validar_campo_textfield_textarea
    Esquema do Cenário: Validar campo textfield, sobrenome, sugestões
        Quando o usuário digitar <campo>
        Então no campo <componente> deve apresentar a palavra <resultado>
        Exemplos:
        |campo                | componente     | resultado   |
        |Batatinha            | textfield      | Batatinha   |
        |Frita                | sobrenome      | Frita   |
        |Batatinha Batatinha  | sugestoes      | Batatinha Batatinha   |

   @validar_elemento_radiobutton_checkbox
   Esquema do Cenário: Validar elementos Radio Button, checkbox
       Quando o usuário clicar na <elemento>
       Então o <elemento> deve apresentar selecionado
       Exemplos:
       |elemento      |
       |rádio button |
       |checkbox     |


#    Cenário: Validar elemento Radio Button
#        Quando o usuário clicar no elemento rádio button
#        Então o elemento rádio button deve aparecer secionado
#
#    Cenário: Validar elemento checkbox
#        Quando o usuário clicar no elemento checkbox
#        Então o elemento checkbox deve aparecer secionado

