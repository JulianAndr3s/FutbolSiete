import { browser, logging, element, by } from 'protractor';
import { ClientePage } from './page-object/cliente.po';
import { CanchaPage } from './page-object/cancha.po';
import { ReservaPage } from './page-object/reserva.po';

describe('Prueba inicial', function() {
  it('Prueba inicial', function() {
    browser.get('http://localhost:4200/');
    expect(browser.getTitle()).toEqual('FutbolSiete');
    browser.sleep(1000);
  });
});

describe('insertarCliente', function() {
  let clientePage: ClientePage;

  beforeEach(() => {
    clientePage = new ClientePage();
  });

  it('insertarCliente', function() {

    clientePage.redirigirPaginaCrearCliente();
    clientePage.pausaPrueba();

    clientePage.ingresarNombre('JulianTest');
    clientePage.ingresarApellido('Botero');
    clientePage.ingresarTelefono('5666804');
    clientePage.ingresarCorreo('julian@test.com');
    clientePage.ingresarCedula('1223899');

    clientePage.pausaPrueba();

    clientePage.clickBotonCrear();

    expect(browser.getCurrentUrl()).toEqual('http://localhost:4200/clientes');

    clientePage.pausaPrueba();

  });
});

describe('insertarCancha', function() {

  let canchaPage: CanchaPage;

  beforeEach(() => {
    canchaPage = new CanchaPage();
  });

  it('insertarCancha', function() {

    canchaPage.redirigirPaginaCrearCancha();
    canchaPage.pausaPrueba();

    canchaPage.ingresarUbicacion('El Carmen de Viboral Prueba Automatica');
    canchaPage.ingresarJugadores(7);
    canchaPage.ingresarPrecio(75000);
    canchaPage.pausaPrueba();

    canchaPage.clickBotonCrear();

    expect(browser.getCurrentUrl()).toEqual('http://localhost:4200/canchas');

    canchaPage.pausaPrueba();
    
  });
});

describe('insertarReserva', function() {

  let reservaPage: ReservaPage;

  beforeEach(() => {
    reservaPage = new ReservaPage();
  });

  it('insertarReserva', function() {

    reservaPage.redirigirPaginaCrearReserva();
    reservaPage.pausaPrueba();

    reservaPage.clickSelectorCliente();
    reservaPage.pausaPrueba();
    reservaPage.clickSelectorCancha();
    reservaPage.pausaPrueba();

    reservaPage.clickBotonCrear();
    expect(browser.getCurrentUrl()).toEqual('http://localhost:4200/reservas/crear-reserva');

    reservaPage.pausaPrueba();

  });
});

