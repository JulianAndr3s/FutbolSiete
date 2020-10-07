import { browser, element, by } from 'protractor';

export class ReservaPage {

    private selectorCliente = element(by.xpath('/html[1]/body[1]/app-root[1]/app-crear-reserva[1]/div[2]/form[1]/div[1]/div[1]/select[1]/option[1]'));
    private selectorCancha = element(by.xpath('/html[1]/body[1]/app-root[1]/app-crear-reserva[1]/div[2]/form[1]/div[1]/div[2]/select[1]/option[1]'))
    private inputFecha = element(by.id('fecha'));
    private botonCrearReserva = element(by.id('aceptar'));

    redirigirPaginaCrearReserva(){
            browser.get('http://localhost:4200/reservas/crear-reserva');
    }

    pausaPrueba(){
        browser.sleep(3000);
    }

    clickBotonCrear(){
        this.botonCrearReserva.click();
    }

    clickSelectorCliente(){
        this.selectorCliente.click();
    }

    clickSelectorCancha(){
        this.selectorCancha.click();
    }

    ingresarFecha(fecha){
        this.inputFecha.sendKeys(fecha);
    }
}
