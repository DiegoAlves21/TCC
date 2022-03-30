import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cadastro-prestador',
  templateUrl: './cadastro-prestador.component.html',
  styleUrls: ['./cadastro-prestador.component.scss']
})
export class CadastroPrestadorComponent implements OnInit {

  selectedTipoPrestador: number = 0;
  listaTipoPrestador : any[] = [];

  selectedTipoInstituicao: number = 0;
  listaTipoInstituicao : any[] = [];


  constructor() {
    this.listaTipoPrestador = [
      { id: 1, name: 'Posto de Saúde' },
      { id: 2, name: 'Hospital' },
      { id: 3, name: 'Laboratório' },
      { id: 4, name: 'Clínica Médica' }
    ];

    this.listaTipoInstituicao = [
      { id: 1, name: 'Pública' },
      { id: 2, name: 'Privada' }
    ];

   }

  ngOnInit(): void {
  }

}
