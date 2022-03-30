import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-prestador',
  templateUrl: './prestador.component.html',
  styleUrls: ['./prestador.component.scss']
})
export class PrestadorComponent implements OnInit {

  searchText: string = '';
  listaPrestadores : any[] = [];

  constructor(private route: ActivatedRoute, private router: Router) {
    this.listaPrestadores = [
      {
        nome: "Albert Einstein",
        cnpj: "15648795632147",
        tipoPrestador: "Hospital",
        tipoInstituicao: "Privada",
        dataIniVigencia: "28/03/2022",
        dataFimVigencia: ""
      },
      {
        nome: "São Judas",
        cnpj: "98574821345214",
        tipoPrestador: "Hospital",
        tipoInstituicao: "Privada",
        dataIniVigencia: "29/03/2022",
        dataFimVigencia: ""
      },
      {
        nome: "CEMA",
        cnpj: "52541523654788",
        tipoPrestador: "Hospital",
        tipoInstituicao: "Privada",
        dataIniVigencia: "27/03/2022",
        dataFimVigencia: "29/03/2022"
      },
      {
        nome: "Clínica Nova",
        cnpj: "15236547894521",
        tipoPrestador: "Clínica Médica",
        tipoInstituicao: "Pública",
        dataIniVigencia: "28/03/2022",
        dataFimVigencia: ""
      },
      {
        nome: "Laboratório Novo",
        cnpj: "12358754158745",
        tipoPrestador: "Laboratório",
        tipoInstituicao: "Pública",
        dataIniVigencia: "28/03/2022",
        dataFimVigencia: ""
      },
    ]
  }

  ngOnInit(): void {
  }

  adicionar(){
    this.router.navigate(['\cadastrar-prestador']);
  }

}
