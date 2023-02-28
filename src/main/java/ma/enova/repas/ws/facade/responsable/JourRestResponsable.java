package  ma.enova.repas.ws.facade.responsable;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.repas.bean.core.Jour;
import ma.enova.repas.bean.history.JourHistory;
import ma.enova.repas.dao.criteria.core.JourCriteria;
import ma.enova.repas.dao.criteria.history.JourHistoryCriteria;
import ma.enova.repas.service.facade.responsable.JourResponsableService;
import ma.enova.repas.ws.converter.JourConverter;
import ma.enova.repas.ws.dto.JourDto;
import ma.enova.repas.ws.dto.TypeRepasDto;
import ma.enova.repas.zynerator.controller.AbstractController;
import ma.enova.repas.zynerator.dto.AuditEntityDto;
import ma.enova.repas.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.repas.zynerator.process.Result;

@Api("Manages jour services")
@RestController
@RequestMapping("/api/responsable/jour/")
public class JourRestResponsable  extends AbstractController<Jour, JourDto, JourHistory, JourCriteria, JourHistoryCriteria, JourResponsableService, JourConverter> {

    @ApiOperation("Finds a list of all jours")
    @GetMapping("")
    public ResponseEntity<List<JourDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  jour")
    @PutMapping("")
    public ResponseEntity<JourDto> update(@RequestBody JourDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a jour by id")
    @GetMapping("{id}")
    public ResponseEntity<JourDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  jour")
    @PostMapping("")
    public ResponseEntity<JourDto> save(@RequestBody JourDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of jour")
    @DeleteMapping("delete")
    public ResponseEntity<List<JourDto>> delete(@RequestBody List<JourDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified jour")
    @DeleteMapping("")
    public ResponseEntity<JourDto> delete(@RequestBody JourDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified jour")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple jours by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds jours by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<JourDto>> findByCriteria(@RequestBody JourCriteria criteria) throws Exception {
        ResponseEntity<List<JourDto>> byCriteria = super.findByCriteria(criteria);
        return byCriteria;
    }

    @ApiOperation("Finds paginated jours by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody JourCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports jours by criteria")
    @PostMapping("exportJours")
    public ResponseEntity<InputStreamResource> export(@RequestBody JourCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets jour data size by criteria")
    @PostMapping("getJoursDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody JourCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets jour history by id")
    @GetMapping("histJour/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets jour paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody JourHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports jour history by criteria")
    @PostMapping("exportJoursHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody JourHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets jour history data size by criteria")
    @PostMapping("getHistJoursDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody JourHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public JourRestResponsable (JourResponsableService service, JourConverter converter) {
        super(service, converter);
    }


}
