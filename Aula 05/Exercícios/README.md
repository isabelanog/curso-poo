# Exercícios

## Exercício 1

Crie uma interface `FormaPagamento` com o método:

```java
boolean autorizarPagamento(double valor;) 
```

Implemente duas classes:

`CartaoCredito` → autoriza apenas pagamentos até R$ 1000

`TransferenciaBancaria` → autoriza pagamentos de qualquer valor

Na classe `App`, leia um valor qualquer e use polimorfismo para tentar processar o pagamento com ambas as formas. Imprima se o pagamento foi autorizado ou não.

## Exercício 2

Crie uma interface `OperacoesBancarias` com os métodos:

```java
void depositar(double valor);
void sacar(double valor);
double consultarSaldo();
```

Crie uma classe `ContaCorrente` que implemente a interface. Ela deve:

* Permitir saque somente se houver saldo

* Mostrar o saldo atualizado após cada operação

* Na classe `App`, simule uma sequência de operações em uma `ContaCorrente`.

## Exercício 3

Crie uma interface `Sensor` com os métodos:

```java
double lerValor();
boolean estaAtivo();
```
Implemente duas classes:

* `SensorTemperatura` → simula leitura de temperatura entre 15 e 30°C

* `SensorUmidade` → simula leitura de umidade entre 40% e 90%

Na `App`, instancie os sensores e exiba os valores lidos.

## Exercício 4

Crie uma interface `Autenticavel` com:

```java
boolean autenticar(String senha);
```

Implemente:

`UsuarioComum` → autentica se a senha for "123"

`Administrador` → autentica se a senha for "admin123"

Na `App`, peça ao usuário uma senha e verifique se ele consegue acessar como usuário comum e como administrador.

