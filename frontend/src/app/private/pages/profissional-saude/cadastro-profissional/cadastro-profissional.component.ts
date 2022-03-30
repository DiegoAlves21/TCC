import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cadastro-profissional',
  templateUrl: './cadastro-profissional.component.html',
  styleUrls: ['./cadastro-profissional.component.scss']
})
export class CadastroProfissionalComponent implements OnInit {

  selectedEspecialidade: number = 0;
  listaEspecialidade : any[] = [];

  selectedPrestador: number = 0;
  listaPrestador : any[] = [];


  constructor() {
    this.listaEspecialidade = [
      { id: 1, name: 'Cardiologia' },
      { id: 2, name: 'Pediatria' },
      { id: 3, name: 'Alergologia' },
      { id: 4, name: 'Neurologia' },
      { id: 5, name: 'Psquiatria' }
    ];

    this.listaPrestador = [
      { id: 1, name: 'Albert Einstein' },
      { id: 2, name: 'São Judas' },
      { id: 3, name: 'CEMA' },
      { id: 4, name: 'Clínica Nova' },
      { id: 5, name: 'Laboratório Novo' }
    ];
   }

  ngOnInit(): void {
  }

}
