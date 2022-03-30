import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-profissional-saude',
  templateUrl: './profissional-saude.component.html',
  styleUrls: ['./profissional-saude.component.scss']
})
export class ProfissionalSaudeComponent implements OnInit {
  searchText: string = '';
  listaProfissionais : any[] = [];

  constructor(private route: ActivatedRoute, private router: Router) {
    this.listaProfissionais = [
      {
        nome: "Diogo Silva",
        especialidade: "Pediatria",
        dataIniVigencia: "28/03/2022",
        dataFimVigencia: "",
        cpf: "35478951254",
        prestador:"São Judas"
      },
      {
        nome: "Eduardo Gomes",
        especialidade: "Otorrinolaringologia",
        dataIniVigencia: "29/03/2022",
        dataFimVigencia: "",
        cpf: "12387458965",
        prestador:"Albert Einstein"
      },
      {
        nome: "João Silva",
        especialidade: "Alergologia",
        dataIniVigencia: "27/03/2022",
        dataFimVigencia: "29/03/2022",
        cpf: "14875186762",
        prestador:"Albert Einstein"
      },
      {
        nome: "Priscila Alcântara",
        especialidade: "Cardiolodia",
        dataIniVigencia: "28/03/2022",
        dataFimVigencia: "",
        cpf: "64875178951",
        prestador:"Albert Einstein"
      },
      {
        nome: "Breno Oliveira",
        especialidade: "Psquiatria",
        dataIniVigencia: "28/03/2022",
        dataFimVigencia: "",
        cpf: "48527915874",
        prestador:"São Judas"
      },
    ]
  }

  ngOnInit() {
  }

  adicionar(){
    this.router.navigate(['\cadastrar-profissional']);
  }

}
