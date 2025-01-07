package com.graphhopper.routing.util.parsers.sfo;

import com.graphhopper.reader.ReaderWay;
import com.graphhopper.reader.osm.sfo.AdministrativeLevel;
import com.graphhopper.routing.ev.EdgeIntAccess;
import com.graphhopper.routing.ev.EncodedValueLookup;
import com.graphhopper.routing.ev.IntEncodedValue;
import com.graphhopper.storage.IntsRef;

public class SubareaOsmIdParser extends AdministrativeParser {
    public static final String KEY = AdministrativeLevel.SUBAREA.getName() + "_osm_id";
    private static final String ADMIN_TYPE = AdministrativeLevel.SUBAREA.getName();
    private final IntEncodedValue encoder;

    public SubareaOsmIdParser(EncodedValueLookup encodedValueLookup) {
        this.encoder = encodedValueLookup.getIntEncodedValue(KEY);
    }

    @Override
    public void handleWayTags(int edgeId, EdgeIntAccess edgeIntAccess, ReaderWay way, IntsRef relationFlags) {
        handleOsmId(edgeId, edgeIntAccess, way, ADMIN_TYPE, encoder);
    }
}
