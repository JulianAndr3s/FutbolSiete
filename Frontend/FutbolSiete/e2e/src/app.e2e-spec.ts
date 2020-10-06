import { browser, logging, element, by } from 'protractor';

describe('Prueba inicial', function() {
  it('Prueba inicial', function() {
    browser.get('http://localhost:4200/');
    expect(browser.getTitle()).toEqual('FutbolSiete');
    browser.sleep(1000);
  });
});

describe('insertarCliente', function() {
  it('insertarCliente', function() {
    browser.get('http://localhost:4200/crear-cliente');
    browser.sleep(3000);

    element(by.name('nombre')).sendKeys('Julian Test');
    element(by.name('apellido')).sendKeys('Botero Test');
    element(by.name('telefono')).sendKeys('5666804');
    element(by.name('correo')).sendKeys('julian@hotmail.com');
    element(by.name('cedula')).sendKeys('1045678');
    browser.sleep(2000);
    element(by.id('registrar')).click();
    browser.sleep(2000);
  });
});

describe('listarCliente', function() {
  it('listarCliente', function() {
    browser.get('http://localhost:4200/clientes');
    expect(browser.getTitle()).toEqual('FutbolSiete');
    browser.sleep(3000);
  });
});

describe('insertarCancha', function() {
  it('insertarCancha', function() {
    browser.get('http://localhost:4200/crear-cancha');
    browser.sleep(3000);

    element(by.id('ubicacion')).sendKeys('El Carmen de Viboral Prueba Automatica');
    element(by.id('cantidadJugadores')).sendKeys(7);
    element(by.id('valorCancha')).sendKeys(75000);
    browser.sleep(2000);
    element(by.id('aceptar')).click();
    browser.sleep(2000);
  });
});

describe('listarCancha', function() {
  it('listarCancha', function() {
    browser.get('http://localhost:4200/canchas');
    expect(browser.getTitle()).toEqual('FutbolSiete');
    browser.sleep(3000);
  });
});

describe('insertarReserva', function() {
  it('insertarReserva', function() {
    browser.get('http://localhost:4200/crear-reserva');

    element(by.xpath('/html[1]/body[1]/app-root[1]/app-crear-reserva[1]/div[2]/form[1]/div[1]/div[1]/select[1]/option[1]')).click();
    browser.sleep(3000);
    element(by.xpath('/html[1]/body[1]/app-root[1]/app-crear-reserva[1]/div[2]/form[1]/div[1]/div[2]/select[1]/option[1]')).click();
    browser.sleep(3000);

    element(by.id('fecha')).sendKeys('02/12/2020')
    element(by.id('aceptar')).click();
  });
});

describe('listarReserva', function() {
  it('listarReserva', function() {
    browser.get('http://localhost:4200/reservas');
    expect(browser.getTitle()).toEqual('FutbolSiete');
  });
});

describe('Prueba final', function() {
  it('Prueba final', function() {
    browser.get('http://localhost:4200/');
    expect(browser.getTitle()).toEqual('FutbolSiete');
  });
});