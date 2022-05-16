package domain

import domain.criterio.CriterioDeAprovacao
import domain.criterio.Basico

class AnalisadorDeAprovacao {

    private var criterio : CriterioDeAprovacao = Basico()

    public fun defineCriterio (novoCriterio : CriterioDeAprovacao) {
        this.criterio = novoCriterio
    }

    public fun fechaBoletim (boletim : Boletim): BoletimFechado{
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, this.criterio.mediaFinal(boletim), this.criterio.estaAprovado(boletim))
    }
}