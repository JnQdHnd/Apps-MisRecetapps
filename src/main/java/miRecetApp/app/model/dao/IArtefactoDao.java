package miRecetApp.app.model.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import miRecetApp.app.model.entity.Artefacto;

public interface IArtefactoDao extends PagingAndSortingRepository<Artefacto, Long> {
	public Artefacto findByNombreLikeIgnoreCase(String term);
}
