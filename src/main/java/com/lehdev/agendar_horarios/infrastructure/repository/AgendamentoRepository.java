package com.lehdev.agendar_horarios.infrastructure.repository;

import com.lehdev.agendar_horarios.infrastructure.entity.Agendamento;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    Agendamento findByServicoAndDataHoraAgendamentoBetween(String servico, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFinal);

    @Transactional
    void deleteByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);

    Agendamento findByDataHoraAgendamentoBetween(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim);

    Agendamento findByDataAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String clinte);
}
