Feature: Llenar un formulario

  @FormularioSuccessFul
  Scenario Outline:
    Given usuario abre el sitio web
    When inserta los datos del formulario <usuario>,<email>,<contrasena>,<confcontrasena>,<nombre>,<apellido>,<telefono>,<ciudad>,<direccion>,<provincia>,<postalcode>
    Then usuario observa el registro exitoso <validtext>
    Examples:
    |usuario|email|contrasena|confcontrasena|nombre|apellido|telefono|ciudad|direccion|provincia|postalcode|validtext|
    |testABC1|test@test.com|Test123++|Test123++|alejandro|polo|3216549870|medellin|Cl 0 # 0- 0|antioquia|05001|xxxxxx|

  # Cada vez que se ejecute el feature en el campo Usuario este debe