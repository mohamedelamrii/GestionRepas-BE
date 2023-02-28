package  ma.enova.repas.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.repas.bean.core.Planning;
import ma.enova.repas.bean.history.PlanningHistory;
import ma.enova.repas.dao.criteria.core.PlanningCriteria;
import ma.enova.repas.dao.criteria.history.PlanningHistoryCriteria;
import ma.enova.repas.service.facade.admin.PlanningAdminService;
import ma.enova.repas.ws.converter.PlanningConverter;
import ma.enova.repas.ws.dto.PlanningDto;
import ma.enova.repas.zynerator.controller.AbstractController;
import ma.enova.repas.zynerator.dto.AuditEntityDto;
import ma.enova.repas.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.repas.zynerator.process.Result;
import ma.enova.repas.workflow.admin.process.planning.save.PlanningSaveAdminProcess ;
import ma.enova.repas.workflow.admin.process.planning.save.PlanningSaveAdminInput ;
import ma.enova.repas.workflow.admin.process.planning.save.PlanningSaveAdminOutput ;

@Api("Manages planning services")
@RestController
@RequestMapping("/api/admin/planning")
public class PlanningRestAdmin  extends AbstractController<Planning, PlanningDto, PlanningHistory, PlanningCriteria, PlanningHistoryCriteria, PlanningAdminService, PlanningConverter> {

    @ApiOperation("save a planning")
    @PostMapping("process/save")
    public ResponseEntity<Result<PlanningSaveAdminInput,PlanningSaveAdminOutput, Planning>> saveProcess(@RequestBody PlanningSaveAdminInput input) throws Exception {
        Result<PlanningSaveAdminInput, PlanningSaveAdminOutput, Planning> result = planningSaveAdminProcess.execute(input);
        return new ResponseEntity<>(result, result.getStatus());
    }
    @ApiOperation("Finds a list of all plannings")
    @GetMapping("")
    public ResponseEntity<List<PlanningDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  planning")
    @PutMapping("")
    public ResponseEntity<PlanningDto> update(@RequestBody PlanningDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a planning by id")
    @GetMapping("{id}")
    public ResponseEntity<PlanningDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  planning")
    @PostMapping("")
    public ResponseEntity<PlanningDto> save(@RequestBody PlanningDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of planning")
    @DeleteMapping("/delete")
    public ResponseEntity<List<PlanningDto>> delete(@RequestBody List<PlanningDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified planning")
    @DeleteMapping("")
    public ResponseEntity<PlanningDto> delete(@RequestBody PlanningDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified planning")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple plannings by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by categoriePatient id")
    @GetMapping("categoriePatient/id/{id}")
    public List<Planning> findByCategoriePatientId(@PathVariable Long id){
        return service.findByCategoriePatientId(id);
    }
    @ApiOperation("delete by categoriePatient id")
    @DeleteMapping("categoriePatient/id/{id}")
    public int deleteByCategoriePatientId(@PathVariable Long id){
        return service.deleteByCategoriePatientId(id);
    }
    @ApiOperation("find by jour id")
    @GetMapping("jour/id/{id}")
    public List<Planning> findByJourId(@PathVariable Long id){
        return service.findByJourId(id);
    }
    @ApiOperation("delete by jour id")
    @DeleteMapping("jour/id/{id}")
    public int deleteByJourId(@PathVariable Long id){
        return service.deleteByJourId(id);
    }
    @ApiOperation("Finds a planning and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<PlanningDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds plannings by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<List<PlanningDto>> findByCriteria(@RequestBody PlanningCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated plannings by criteria")
    @PostMapping("paginatedfind-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PlanningCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports plannings by criteria")
    @PostMapping("exportPlannings")
    public ResponseEntity<InputStreamResource> export(@RequestBody PlanningCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets planning data size by criteria")
    @PostMapping("getPlanningsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody PlanningCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets planning history by id")
    @GetMapping("histPlanning/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets planning paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PlanningHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports planning history by criteria")
    @PostMapping("exportPlanningsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PlanningHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets planning history data size by criteria")
    @PostMapping("getHistPlanningsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PlanningHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PlanningRestAdmin (PlanningAdminService service, PlanningConverter converter) {
        super(service, converter);
    }

    @Autowired
    private PlanningSaveAdminProcess planningSaveAdminProcess;

}
