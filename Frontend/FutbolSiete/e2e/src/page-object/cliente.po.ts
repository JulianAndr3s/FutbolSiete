import { browser, element, by } from 'protractor';

export class ClientePage {

    private inputNombre = element(by.name('nombre'));
    private inputApellido = element(by.name('apellido'));
    private inputTelefono = element(by.name('telefono'));
    private inputCorreo = element(by.name('correo'));
    private inputCedula = element(by.name('cedula'));
    private botonCrearCliente = element(by.id('registrar'));

    redirigirPaginaCrearCliente(){
            browser.get('http://localhost:4200/clientes/crear-cliente');
    }

    pausaPrueba(){
        browser.sleep(3000);
    }

    clickBotonCrear(){
        this.botonCrearCliente.click();
    }

    ingresarNombre(nombre){
        this.inputNombre.sendKeys(nombre);
    }

    ingresarApellido(apellido){
        this.inputApellido.sendKeys(apellido);
    }

    ingresarTelefono(telefono){
        this.inputTelefono.sendKeys(telefono);
    }

    ingresarCorreo(correo){
        this.inputCorreo.sendKeys(correo);
    }
    
    ingresarCedula(cedula){
        this.inputCedula.sendKeys(cedula);
    }
}

