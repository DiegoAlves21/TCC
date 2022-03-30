import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-consulta',
  templateUrl: './consulta.component.html',
  styleUrls: ['./consulta.component.scss']
})
export class ConsultaComponent implements OnInit {

  searchText: string = '';
  listaConsultas : any[] = [];

  constructor(private route: ActivatedRoute, private router: Router) {
    this.listaConsultas = [
      {
        paciente: "Diego Alves",
        horario: "15H",
        dataConsulta: "28/04/2022",
        prestador: "Albert Einstein",
        profissionalSaude: "Diogo Silva",
        tipoDeExameOuProc: "Consulta",
        situacao: "Cancelada"
      },
      {
        paciente: "Maria Luíza",
        horario: "12H",
        dataConsulta: "27/04/2022",
        prestador: "São Judas",
        profissionalSaude: "Eduardo Gomes",
        tipoDeExameOuProc: "Ressonância Magnética",
        situacao: "Pendente"
      },
      {
        paciente: "Cláudia Márcia",
        horario: "13H",
        dataConsulta: "18/03/2022",
        prestador: "CEMA",
        profissionalSaude: "João Silva",
        tipoDeExameOuProc: "Nasofibroscopia",
        situacao: "Realizada"
      },
      {
        paciente: "Jully Mayara",
        horario: "9H",
        dataConsulta: "11/03/2022",
        prestador: "Clínica Nova",
        profissionalSaude: "Priscila Alcântara",
        tipoDeExameOuProc: "Consulta",
        situacao: "Realizada"
      },
      {
        paciente: "Donatello Silva",
        horario: "11H",
        dataConsulta: "07/04/2022",
        prestador: "Laboratório Novo",
        profissionalSaude: "Breno Oliveira",
        tipoDeExameOuProc: "Exame de Sangue",
        situacao: "Cancelada"
      },
    ]
  }

  ngOnInit(): void {
  }

  adicionar(){
    this.router.navigate(['\cadastrar-consulta']);
  }

}
