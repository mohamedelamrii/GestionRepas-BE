package  ma.enova.repas.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.repas.bean.core.Repas;
import ma.enova.repas.bean.history.RepasHistory;
import ma.enova.repas.dao.criteria.core.RepasCriteria;
import ma.enova.repas.dao.criteria.history.RepasHistoryCriteria;
import ma.enova.repas.service.facade.admin.RepasAdminService;
import ma.enova.repas.ws.converter.RepasConverter;
import ma.enova.repas.ws.dto.RepasDto;
import ma.enova.repas.zynerator.controller.AbstractController;
import ma.enova.repas.zynerator.dto.AuditEntityDto;
import ma.enova.repas.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.repas.zynerator.process.Result;

@Api("Manages repas services")
@RestController
@RequestMapping("/api/admin/repas/")
public class RepasRestAdmin  extends AbstractController<Repas, RepasDto, RepasHistory, RepasCriteria, RepasHistoryCriteria, RepasAdminService, RepasConverter> {

    @ApiOperation("Finds a list of all repass")
    @GetMapping("")
    public ResponseEntity<List<RepasDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  repas")
    @PutMapping("")
    public ResponseEntity<RepasDto> update(@RequestBody RepasDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a repas by id")
    @GetMapping("id/{id}")
    public ResponseEntity<RepasDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  repas")
    @PostMapping("")
    public ResponseEntity<RepasDto> save(@RequestBody RepasDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of repas")
    @DeleteMapping("delete")
    public ResponseEntity<List<RepasDto>> delete(@RequestBody List<RepasDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified repas")
    @DeleteMapping("")
    public ResponseEntity<RepasDto> delete(@RequestBody RepasDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified repas")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple repass by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by typeRepas id")
    @GetMapping("typeRepas/id/{id}")
    public List<Repas> findByTypeRepasId(@PathVariable Long id){
        return service.findByTypeRepasId(id);
    }
    @ApiOperation("delete by typeRepas id")
    @DeleteMapping("typeRepas/id/{id}")
    public int deleteByTypeRepasId(@PathVariable Long id){
        return service.deleteByTypeRepasId(id);
    }
    @ApiOperation("Finds a repas and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<RepasDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds repass by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<RepasDto>> findByCriteria(@RequestBody RepasCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated repass by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody RepasCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports repass by criteria")
    @PostMapping("exportRepass")
    public ResponseEntity<InputStreamResource> export(@RequestBody RepasCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets repas data size by criteria")
    @PostMapping("getRepassDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody RepasCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets repas history by id")
    @GetMapping("histRepas/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets repas paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody RepasHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports repas history by criteria")
    @PostMapping("exportRepassHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody RepasHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets repas history data size by criteria")
    @PostMapping("getHistRepassDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody RepasHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public RepasRestAdmin (RepasAdminService service, RepasConverter converter) {
        super(service, converter);
    }


}
