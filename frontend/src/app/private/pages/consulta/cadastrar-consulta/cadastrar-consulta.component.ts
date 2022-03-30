import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cadastrar-consulta',
  templateUrl: './cadastrar-consulta.component.html',
  styleUrls: ['./cadastrar-consulta.component.scss']
})
export class CadastrarConsultaComponent implements OnInit {

  selectedPaciente: number = 0;
  listaPaciente : any[] = [];

  selectedTipoExame: number = 0;
  listaTipoExame : any[] = [];

  selectedTipoProcedimento: number = 0;
  listaTipoProcedimento : any[] = [];

  selectedPrestador: number = 0;
  listaPrestador : any[] = [];

  selectedProfissional: number = 0;
  listaProfissional : any[] = [];


  constructor() {
    this.listaTipoExame = [
      { id: 1, name: 'Ultrasonografia' },
      { id: 2, name: 'Exame de Urina' },
      { id: 3, name: 'Hemograma' },
      { id: 4, name: 'Ressonância Magnética' }
    ];

    this.listaTipoProcedimento = [
      { id: 1, name: 'Drenagem Toráxica' },
      { id: 2, name: 'Hemoterapia' },
      { id: 3, name: 'Transfusão de Sangue' },
      { id: 4, name: 'Consulta Médica' }
    ];

    this.listaPrestador = [
      { id: 1, name: 'Albert Einstein' },
      { id: 2, name: 'São Judas' },
      { id: 3, name: 'CEMA' },
      { id: 4, name: 'Clínica Nova' },
      { id: 5, name: 'Laboratório Novo' }
    ];

    this.listaProfissional = [
      { id: 1, name: 'Diogo Silva' },
      { id: 2, name: 'Eduardo Gomes' },
      { id: 3, name: 'João Silva' },
      { id: 4, name: 'Priscila Alcântara' },
      { id: 5, name: 'Breno Oliveira' }
    ];

    this.listaPaciente = [
      { id: 1, name: 'Diego Alves' },
      { id: 2, name: 'Maria Luíza' },
      { id: 3, name: 'Cláudia Márcia' },
      { id: 4, name: 'Jully Mayara' },
      { id: 5, name: 'Donatello Silva' }
    ];

   }

  ngOnInit(): void {
  }

}
