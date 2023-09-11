# FPOO-SA2Sem

# Calculadora de custo de combustível:
<p>Responsável: Gabriel Aguilar Paiva</p>
<p>Layout aplicado: Foi utilizado o GridBag para organizar os elementos no frame, pois utiliza a posição em grid x e y para determinar a posição dos elementos na tela. </p>
<p>Funcionalidade: Foi criada uma ação executada ao clicar no botão de calcular, que lê as informações nos JLabels e executa os cálculos, exibindo o resultado das operações em uma Label de resultado já existente.</p>

# Calculadora Padrão:
<p>Responsável: Guilherme Gama Brum</p>
<p>Layout aplicado: GridLayout, pois é uma ferramenta simples para organizar elementos de forma retangular e responsiva.</p>
<p>Funcionalidade: os numeros e operações digitados são inseridos no visor (Uma JLabel) e ao clicar no sinal de igual (=) uma ação que executa os calculos com os números e operações inseridas, exibindo o resultado no mesmo visor. O visor pode ser utilizado para adicionar numeros e operações manualmente, sem o uso dos botões, assim como apagar dados no visor.</p>

# Calculadora IMC:
<p>Responsável: João Vittor Domingos de Jesus</p>
<p>Layout Aplicado: BoderLayout & GridLayout, o BorderLayout foi utilizado para posicionar os paineis de entrada de dados, painel do botão que realiza o calculo e o painel que exibe os resultados. <br>
O GridLayout foi utilizado dentro do painel de entrada de dados em uma tabela 2x2.</p>
<p>Funcionalidade: Os campos de entrada coletam os dados de peso e altura, o botão calcular chama um actionListener para executar o metodo onde os dados são convertidos de String para Double e tem como retorno o resultado do calculo de IMC na variável bmi.</p>