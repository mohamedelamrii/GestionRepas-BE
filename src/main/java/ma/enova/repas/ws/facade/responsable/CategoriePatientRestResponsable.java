package  ma.enova.repas.ws.facade.responsable;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.repas.bean.core.CategoriePatient;
import ma.enova.repas.bean.history.CategoriePatientHistory;
import ma.enova.repas.dao.criteria.core.CategoriePatientCriteria;
import ma.enova.repas.dao.criteria.history.CategoriePatientHistoryCriteria;
import ma.enova.repas.service.facade.responsable.CategoriePatientResponsableService;
import ma.enova.repas.ws.converter.CategoriePatientConverter;
import ma.enova.repas.ws.dto.CategoriePatientDto;
import ma.enova.repas.zynerator.controller.AbstractController;
import ma.enova.repas.zynerator.dto.AuditEntityDto;
import ma.enova.repas.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.repas.zynerator.process.Result;

@Api("Manages categoriePatient services")
@RestController
@RequestMapping("/api/responsable/categoriePatient/")
public class CategoriePatientRestResponsable  extends AbstractController<CategoriePatient, CategoriePatientDto, CategoriePatientHistory, CategoriePatientCriteria, CategoriePatientHistoryCriteria, CategoriePatientResponsableService, CategoriePatientConverter> {

    @ApiOperation("Finds a list of all categoriePatients")
    @GetMapping("")
    public ResponseEntity<List<CategoriePatientDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  categoriePatient")
    @PutMapping("")
    public ResponseEntity<CategoriePatientDto> update(@RequestBody CategoriePatientDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a categoriePatient by id")
    @GetMapping("{id}")
    public ResponseEntity<CategoriePatientDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  categoriePatient")
    @PostMapping("")
    public ResponseEntity<CategoriePatientDto> save(@RequestBody CategoriePatientDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of categoriePatient")
    @DeleteMapping("delete")
    public ResponseEntity<List<CategoriePatientDto>> delete(@RequestBody List<CategoriePatientDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified categoriePatient")
    @DeleteMapping("")
    public ResponseEntity<CategoriePatientDto> delete(@RequestBody CategoriePatientDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified categoriePatient")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple categoriePatients by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds categoriePatients by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CategoriePatientDto>> findByCriteria(@RequestBody CategoriePatientCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated categoriePatients by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CategoriePatientCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categoriePatients by criteria")
    @PostMapping("exportCategoriePatients")
    public ResponseEntity<InputStreamResource> export(@RequestBody CategoriePatientCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets categoriePatient data size by criteria")
    @PostMapping("getCategoriePatientsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody CategoriePatientCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets categoriePatient history by id")
    @GetMapping("histCategoriePatient/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets categoriePatient paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CategoriePatientHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categoriePatient history by criteria")
    @PostMapping("exportCategoriePatientsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CategoriePatientHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets categoriePatient history data size by criteria")
    @PostMapping("getHistCategoriePatientsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CategoriePatientHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CategoriePatientRestResponsable (CategoriePatientResponsableService service, CategoriePatientConverter converter) {
        super(service, converter);
    }


}
