import { browser, element, by } from 'protractor';

export class CanchaPage {

    private inputUbicacion = element(by.id('ubicacion'));
    private inputJugadores = element(by.id('cantidadJugadores'));
    private inputPrecio = element(by.id('valorCancha'));
    private botonCrearCancha = element(by.id('aceptar'));

    redirigirPaginaCrearCancha(){
            browser.get('http://localhost:4200/canchas/crear-cancha');
    }

    pausaPrueba(){
        browser.sleep(3000);
    }

    clickBotonCrear(){
        this.botonCrearCancha.click();
    }

    ingresarUbicacion(ubicacion){
        this.inputUbicacion.sendKeys(ubicacion);
    }

    ingresarJugadores(cantidadJugadores){
        this.inputJugadores.sendKeys(cantidadJugadores);
    }

    ingresarPrecio(valorCancha){
        this.inputPrecio.sendKeys(valorCancha);
    }
}
