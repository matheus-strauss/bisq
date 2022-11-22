/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.core.dao.burningman.accounting.balance;

import bisq.common.util.Hex;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
@Getter
public class ReceivedBtcBalanceEntry extends BaseBalanceEntry {
    // We store only last 4 bytes in the AccountTx which is used to create a ReceivedBtcBalanceEntry instance.
    public ReceivedBtcBalanceEntry(byte[] truncatedTxId, long amount, Date date, BalanceEntry.Type type) {
        super(Hex.encode(truncatedTxId), amount, date, type);
    }
}
