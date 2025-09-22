package com.vittorhonorato.integracao.Integracao.steps;

import com.vittorhonorato.integracao.Integracao.entity.User;
import com.vittorhonorato.integracao.Integracao.service.UserService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;


public class UserStep {

    @Autowired
    private UserService userService;

    @Autowired
    private TestRestTemplate restTemplate;

    private ResponseEntity<User[]> response;


    @Given("que existem usuários cadastrados")
    public void deveRetornarUsuariosCadastrados() {
        User userRandom = User.builder()
                .name("João")
                .email("joaotestejava@gmail.com")
                .password("1234joao")
                .build();

        userService.saveUser(userRandom);
    }

    @When("eu faço uma requisição GET para obter usuários")
    public void euFacoUmaRequisicaoGETPara() {
        response = restTemplate.getForEntity("/user", User[].class);
    }

    @Then("a resposta deve ter o status code {int}")
    public void deveRetornar200(int status) {
        assertThat(response.getStatusCode().value()).isEqualTo(status);
    }

    @And("a resposta deve conter uma lista de usuários")
    public void deveRetornarUmaListaDeUsuarios() {
        assertThat(response.getBody()).isNotEmpty();
    }

    @And("verifico se o usuario foi salvo no banco de dados")
    public void deveRetornarUmUsuarioDoH2() {
        assertThat(userService.getAllUsers()).isNotEmpty();
    }



}
