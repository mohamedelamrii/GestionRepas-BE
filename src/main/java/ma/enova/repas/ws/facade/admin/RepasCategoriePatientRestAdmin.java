package  ma.enova.repas.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.repas.bean.core.RepasCategoriePatient;
import ma.enova.repas.bean.history.RepasCategoriePatientHistory;
import ma.enova.repas.dao.criteria.core.RepasCategoriePatientCriteria;
import ma.enova.repas.dao.criteria.history.RepasCategoriePatientHistoryCriteria;
import ma.enova.repas.service.facade.admin.RepasCategoriePatientAdminService;
import ma.enova.repas.ws.converter.RepasCategoriePatientConverter;
import ma.enova.repas.ws.dto.RepasCategoriePatientDto;
import ma.enova.repas.zynerator.controller.AbstractController;
import ma.enova.repas.zynerator.dto.AuditEntityDto;
import ma.enova.repas.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.repas.zynerator.process.Result;

@Api("Manages repasCategoriePatient services")
@RestController
@RequestMapping("/api/admin/repasCategoriePatient")
public class RepasCategoriePatientRestAdmin  extends AbstractController<RepasCategoriePatient, RepasCategoriePatientDto, RepasCategoriePatientHistory, RepasCategoriePatientCriteria, RepasCategoriePatientHistoryCriteria, RepasCategoriePatientAdminService, RepasCategoriePatientConverter> {

    @ApiOperation("Finds a list of all repasCategoriePatients")
    @GetMapping("")
    public ResponseEntity<List<RepasCategoriePatientDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  repasCategoriePatient")
    @PutMapping("")
    public ResponseEntity<RepasCategoriePatientDto> update(@RequestBody RepasCategoriePatientDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a repasCategoriePatient by id")
    @GetMapping("{id}")
    public ResponseEntity<RepasCategoriePatientDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  repasCategoriePatient")
    @PostMapping("")
    public ResponseEntity<RepasCategoriePatientDto> save(@RequestBody RepasCategoriePatientDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of repasCategoriePatient")
    @DeleteMapping("/delete")
    public ResponseEntity<List<RepasCategoriePatientDto>> delete(@RequestBody List<RepasCategoriePatientDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified repasCategoriePatient")
    @DeleteMapping("")
    public ResponseEntity<RepasCategoriePatientDto> delete(@RequestBody RepasCategoriePatientDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified repasCategoriePatient")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple repasCategoriePatients by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by repas id")
    @GetMapping("repas/id/{id}")
    public List<RepasCategoriePatient> findByRepasId(@PathVariable Long id){
        return service.findByRepasId(id);
    }
    @ApiOperation("delete by repas id")
    @DeleteMapping("repas/id/{id}")
    public int deleteByRepasId(@PathVariable Long id){
        return service.deleteByRepasId(id);
    }
    @ApiOperation("find by categoriePatient id")
    @GetMapping("categoriePatient/id/{id}")
    public List<RepasCategoriePatient> findByCategoriePatientId(@PathVariable Long id){
        return service.findByCategoriePatientId(id);
    }
    @ApiOperation("delete by categoriePatient id")
    @DeleteMapping("categoriePatient/id/{id}")
    public int deleteByCategoriePatientId(@PathVariable Long id){
        return service.deleteByCategoriePatientId(id);
    }
    @ApiOperation("Finds repasCategoriePatients by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<RepasCategoriePatientDto>> findByCriteria(@RequestBody RepasCategoriePatientCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated repasCategoriePatients by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody RepasCategoriePatientCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports repasCategoriePatients by criteria")
    @PostMapping("exportRepasCategoriePatients")
    public ResponseEntity<InputStreamResource> export(@RequestBody RepasCategoriePatientCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets repasCategoriePatient data size by criteria")
    @PostMapping("getRepasCategoriePatientsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody RepasCategoriePatientCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets repasCategoriePatient history by id")
    @GetMapping("histRepasCategoriePatient/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets repasCategoriePatient paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody RepasCategoriePatientHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports repasCategoriePatient history by criteria")
    @PostMapping("exportRepasCategoriePatientsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody RepasCategoriePatientHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets repasCategoriePatient history data size by criteria")
    @PostMapping("getHistRepasCategoriePatientsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody RepasCategoriePatientHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public RepasCategoriePatientRestAdmin (RepasCategoriePatientAdminService service, RepasCategoriePatientConverter converter) {
        super(service, converter);
    }


}
