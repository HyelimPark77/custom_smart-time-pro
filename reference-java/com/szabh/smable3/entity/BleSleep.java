package com.szabh.smable3.entity;

import android.util.SparseIntArray;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSleep extends BleWritable {
    public static final int AWAKE = 3;
    public static final int AWAKE_LENGTH = 7;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int DEEP = 1;
    public static final int DEEP_LENGTH = 5;
    public static final int END = 34;
    private static final int ERROR_DATA = 14400;
    public static final int ITEM_LENGTH = 7;
    public static final int LEVEL = 19;
    public static final int LIGHT = 2;
    public static final int LIGHT_LENGTH = 6;
    private static final int OFFSET = 60;
    private static final int PERIOD = 900;
    public static final int PIECEMEAL = 8;
    public static final int REM = 9;
    public static final int SCORE = 18;
    public static final int START = 17;
    public static final int TOTAL_LENGTH = 4;
    private int mMode;
    private int mSoft;
    private int mStrong;
    private int mTime;

    @SourceDebugExtension({"SMAP\nBleSleep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSleep.kt\ncom/szabh/smable3/entity/BleSleep$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1573#2:458\n1604#2,4:459\n1878#2,3:463\n1878#2,3:466\n1878#2,3:469\n1869#2,2:472\n1878#2,3:474\n1878#2,3:477\n1878#2,3:481\n1563#2:484\n1634#2,3:485\n774#2:488\n865#2,2:489\n1#3:480\n*S KotlinDebug\n*F\n+ 1 BleSleep.kt\ncom/szabh/smable3/entity/BleSleep$Companion\n*L\n75#1:458\n75#1:459,4\n92#1:463,3\n199#1:466,3\n236#1:469,3\n259#1:472,2\n342#1:474,3\n368#1:477,3\n401#1:481,3\n430#1:484\n430#1:485,3\n441#1:488\n441#1:489,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ List analyseSleep$default(Companion companion, List list, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.analyseSleep(list, i);
        }

        public static /* synthetic */ List getSleepAllDayViewDatas$default(Companion companion, List list, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.getSleepAllDayViewDatas(list, z);
        }

        @aa1
        public final List<BleSleep> analyseSleep(@aa1 List<BleSleep> origin, int i) {
            Intrinsics.X0O(origin, "origin");
            if (origin.size() < 2) {
                return CollectionsKt__CollectionsKt.m39402iI();
            }
            List<BleSleep> list = origin;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                if (((BleSleep) obj).getMMode() == 17) {
                    i3 = i4;
                }
                arrayList.add(Unit.OXO1);
                i4 = i5;
            }
            List listIiII0 = CollectionsKt___CollectionsKt.IiII0(origin, origin.size() - i3);
            int size = listIiII0.size() - 2;
            if (size >= 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    if (((BleSleep) listIiII0.get(i7)).getMTime() - ((BleSleep) listIiII0.get(i6)).getMTime() >= BleSleep.ERROR_DATA) {
                        return CollectionsKt__CollectionsKt.m39402iI();
                    }
                    if (i6 == size) {
                        break;
                    }
                    i6 = i7;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            if (i == 0) {
                boolean z = false;
                int i8 = 0;
                for (Object obj2 : listIiII0) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt__CollectionsKt.XOX0O0();
                    }
                    BleSleep bleSleep = (BleSleep) obj2;
                    int mMode = bleSleep.getMMode();
                    if (mMode != 1) {
                        if (mMode != 2) {
                            if (mMode != 3) {
                                if (mMode == 17) {
                                    arrayList2.clear();
                                    bleSleep.setMMode(2);
                                    arrayList2.add(bleSleep);
                                    if (listIiII0.size() > i9 && ((BleSleep) listIiII0.get(i9)).getMTime() - bleSleep.getMTime() > 900) {
                                        arrayList2.add(new BleSleep(bleSleep.getMTime() + 900, 1, 0, 0, 12, null));
                                    }
                                    z = true;
                                }
                            } else if (arrayList2.isEmpty() || ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMMode() != bleSleep.getMMode()) {
                                arrayList2.add(bleSleep);
                            }
                        } else if (bleSleep.getMStrong() > 2 || bleSleep.getMSoft() > 25) {
                            if (arrayList2.isEmpty() || bleSleep.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMTime() > 900) {
                                arrayList2.add(BleSleep.copy$default(bleSleep, bleSleep.getMTime() + AppLovinErrorCodes.INVALID_URL, 3, 0, 0, 12, null));
                            } else if (!arrayList2.isEmpty() && bleSleep.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMTime() <= 900) {
                                ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).setMMode(3);
                            }
                        } else if (arrayList2.isEmpty() || ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMMode() != bleSleep.getMMode()) {
                            arrayList2.add(bleSleep);
                        }
                    } else if (bleSleep.getMStrong() > 2) {
                        if (arrayList2.isEmpty() || bleSleep.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMTime() > 960) {
                            arrayList2.add(BleSleep.copy$default(bleSleep, bleSleep.getMTime() + AppLovinErrorCodes.INVALID_URL, 3, 0, 0, 12, null));
                        } else if (arrayList2.isEmpty() || bleSleep.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMTime() > 840) {
                            arrayList2.add(BleSleep.copy$default(bleSleep, 0, 3, 0, 0, 13, null));
                        } else {
                            ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).setMMode(3);
                        }
                    } else if (bleSleep.getMSoft() > 2) {
                        if (arrayList2.isEmpty() || bleSleep.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMTime() > 900) {
                            arrayList2.add(BleSleep.copy$default(bleSleep, bleSleep.getMTime() + AppLovinErrorCodes.INVALID_URL, 2, 0, 0, 12, null));
                        } else if (arrayList2.isEmpty() || bleSleep.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMTime() > 900) {
                            arrayList2.add(BleSleep.copy$default(bleSleep, 0, 2, 0, 0, 13, null));
                        } else {
                            ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).setMMode(2);
                        }
                    } else if (!arrayList2.isEmpty() && ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMMode() == bleSleep.getMMode() && bleSleep.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMTime() > 840) {
                        arrayList2.add(BleSleep.copy$default(bleSleep, bleSleep.getMTime(), 2, 0, 0, 12, null));
                    } else if (arrayList2.size() > 2 && ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMMode() == 2 && ((BleSleep) arrayList2.get(arrayList2.size() - 2)).getMMode() == 1 && bleSleep.getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMTime() > 840) {
                        arrayList2.add(BleSleep.copy$default(bleSleep, bleSleep.getMTime(), 2, 0, 0, 12, null));
                    } else if (arrayList2.isEmpty() || ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMMode() != bleSleep.getMMode()) {
                        arrayList2.add(bleSleep);
                    }
                    i8 = i9;
                }
                if (!z && !arrayList2.isEmpty()) {
                    ((BleSleep) arrayList2.get(0)).setMMode(2);
                    if (arrayList2.size() > 1 && ((BleSleep) arrayList2.get(1)).getMTime() - ((BleSleep) arrayList2.get(0)).getMTime() > 900) {
                        arrayList2.add(1, new BleSleep(((BleSleep) arrayList2.get(0)).getMTime() + 900, 1, 0, 0, 12, null));
                        return arrayList2;
                    }
                }
            } else {
                for (Object obj3 : listIiII0) {
                    int i10 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.XOX0O0();
                    }
                    BleSleep bleSleep2 = (BleSleep) obj3;
                    int mMode2 = bleSleep2.getMMode();
                    if (mMode2 == 1) {
                        arrayList2.add(bleSleep2);
                    } else if (mMode2 == 2) {
                        arrayList2.add(bleSleep2);
                    } else if (mMode2 == 3) {
                        arrayList2.add(bleSleep2);
                    } else if (mMode2 == 17) {
                        arrayList2.clear();
                    } else if (mMode2 == 34 && !arrayList2.isEmpty()) {
                        arrayList2.add(BleSleep.copy$default(bleSleep2, 0, ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList2)).getMMode(), 0, 0, 13, null));
                    }
                    i2 = i10;
                }
            }
            return arrayList2;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        @aa1
        public final List<BleSleep> analyseSleepAllDay(@aa1 List<BleSleep> sleeps, long j) {
            Intrinsics.X0O(sleeps, "sleeps");
            long millis = TimeUnit.DAYS.toMillis(1L) + j;
            i1O0OXO1O.OXO1.OXO1("analyseSleepAllDay -> " + j + ' ' + millis);
            int size = sleeps.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (sleeps.get(i).getMLocalTime() >= j) {
                    break;
                }
                i++;
            }
            i1O0OXO1O.OXO1.OXO1("analyseSleepAllDay -> start = " + i);
            if (i == -1) {
                return CollectionsKt__CollectionsKt.m39402iI();
            }
            if (i > 0) {
                int i2 = i - 1;
                do {
                    BleSleep bleSleep = sleeps.get(i2);
                    if (bleSleep.getMMode() == 17) {
                        i = i2;
                        break;
                    }
                    if (bleSleep.getMMode() == 34) {
                        break;
                    }
                    i2--;
                } while (i2 >= 0);
            }
            i1O0OXO1O.OXO1.OXO1("analyseSleepAllDay -> start = " + i);
            int size2 = sleeps.size();
            int i3 = size2 + (-1);
            do {
                BleSleep bleSleep2 = sleeps.get(i3);
                if (bleSleep2.getMLocalTime() >= millis) {
                    i3--;
                } else {
                    if (bleSleep2.getMMode() == 17) {
                        size2 = i3;
                        break;
                    }
                    if (bleSleep2.getMMode() == 34) {
                        size2 = i3 + 1;
                        break;
                    }
                    i3--;
                }
            } while (i3 >= i);
            i1O0OXO1O.OXO1.OXO1("analyseSleepAllDay -> " + i + " - " + size2);
            return sleeps.subList(i, size2);
        }

        @aa1
        public final HashMap<Integer, Integer> getSleepAllDaySegmentStatus(@aa1 List<BleSleep> sleeps) {
            Intrinsics.X0O(sleeps, "sleeps");
            HashMap<Integer, Integer> map = new HashMap<>();
            int mTime = 0;
            Integer num = 0;
            if (sleeps.size() == 2 && sleeps.get(0).getMMode() == 17 && sleeps.get(1).getMMode() == 34) {
                mTime = sleeps.get(1).getMTime() - sleeps.get(0).getMTime();
            } else if (sleeps.size() > 2) {
                int i = 0;
                for (Object obj : sleeps) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.XOX0O0();
                    }
                    BleSleep bleSleep = (BleSleep) obj;
                    if (i < CollectionsKt__CollectionsKt.X11iII1O1(sleeps)) {
                        int mMode = bleSleep.getMMode();
                        Integer num2 = map.get(Integer.valueOf(mMode));
                        map.put(Integer.valueOf(mMode), Integer.valueOf((num2 != null ? num2.intValue() : 0) + (sleeps.get(i2).getMTime() - sleeps.get(i).getMTime())));
                    }
                    i = i2;
                }
            }
            if (mTime > 0) {
                map.put(8, Integer.valueOf(mTime / 60));
                return map;
            }
            int mTime2 = (((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(sleeps)).getMTime() - ((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(sleeps)).getMTime()) / 60;
            Integer num3 = map.get(2);
            if (num3 == null) {
                num3 = num;
            }
            int iIntValue = num3.intValue() / 60;
            Integer num4 = map.get(1);
            if (num4 == null) {
                num4 = num;
            }
            int iIntValue2 = num4.intValue() / 60;
            Integer num5 = map.get(9);
            int iIntValue3 = (num5 != null ? num5 : 0).intValue() / 60;
            map.put(2, Integer.valueOf(iIntValue));
            map.put(1, Integer.valueOf(iIntValue2));
            map.put(9, Integer.valueOf(iIntValue3));
            map.put(3, Integer.valueOf(((mTime2 - iIntValue) - iIntValue2) - iIntValue3));
            return map;
        }

        @aa1
        public final List<List<BleSleep>> getSleepAllDaySegments(@aa1 List<BleSleep> sleeps) {
            Intrinsics.X0O(sleeps, "sleeps");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Object obj : sleeps) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                BleSleep bleSleep = (BleSleep) obj;
                arrayList2.add(BleSleep.copy$default(bleSleep, 0, 0, 0, 0, 15, null));
                if (bleSleep.getMMode() == 34 || (!arrayList2.isEmpty() && i == CollectionsKt__CollectionsKt.X11iII1O1(sleeps))) {
                    arrayList.add(arrayList2);
                    arrayList2 = new ArrayList();
                }
                i = i2;
            }
            return arrayList;
        }

        @aa1
        public final HashMap<Integer, Integer> getSleepAllDayStatus(@aa1 List<BleSleep> sleeps) {
            Intrinsics.X0O(sleeps, "sleeps");
            List<List<BleSleep>> sleepAllDaySegments = getSleepAllDaySegments(sleeps);
            HashMap<Integer, Integer> map = new HashMap<>();
            int i = 0;
            for (Object obj : sleepAllDaySegments) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                HashMap<Integer, Integer> sleepAllDaySegmentStatus = BleSleep.Companion.getSleepAllDaySegmentStatus((List) obj);
                Integer num = sleepAllDaySegmentStatus.get(2);
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = sleepAllDaySegmentStatus.get(1);
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Integer num3 = sleepAllDaySegmentStatus.get(3);
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                Integer num4 = sleepAllDaySegmentStatus.get(9);
                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                Integer num5 = sleepAllDaySegmentStatus.get(8);
                int iIntValue5 = num5 != null ? num5.intValue() : 0;
                Integer num6 = map.get(2);
                if (num6 == null) {
                    num6 = 0;
                }
                map.put(2, Integer.valueOf(num6.intValue() + iIntValue));
                Integer num7 = map.get(1);
                if (num7 == null) {
                    num7 = 0;
                }
                map.put(1, Integer.valueOf(num7.intValue() + iIntValue2));
                Integer num8 = map.get(3);
                if (num8 == null) {
                    num8 = 0;
                }
                map.put(3, Integer.valueOf(num8.intValue() + iIntValue3));
                Integer num9 = map.get(9);
                if (num9 == null) {
                    num9 = 0;
                }
                map.put(9, Integer.valueOf(num9.intValue() + iIntValue4));
                Integer num10 = map.get(8);
                if (num10 == null) {
                    num10 = 0;
                }
                map.put(8, Integer.valueOf(num10.intValue() + iIntValue5));
                i = i2;
            }
            return map;
        }

        @aa1
        public final List<BleSleep> getSleepAllDayViewDatas(@aa1 List<BleSleep> sleeps, boolean z) {
            Intrinsics.X0O(sleeps, "sleeps");
            ArrayList arrayList = new ArrayList();
            for (List<BleSleep> list : getSleepAllDaySegments(sleeps)) {
                Integer num = getSleepAllDaySegmentStatus(list).get(8);
                if ((num != null ? num.intValue() : 0) <= 0) {
                    if (BleCache.INSTANCE.getMSupportSHSYAlgorithm() == 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            if (((BleSleep) obj).getMMode() != 17) {
                                arrayList2.add(obj);
                            }
                        }
                        list = arrayList2;
                    }
                    arrayList.addAll(list);
                } else if (z) {
                    arrayList.add(BleSleep.copy$default(list.get(0), 0, 17, 0, 0, 13, null));
                    List<BleSleep> list2 = list;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                    for (BleSleep bleSleep : list2) {
                        bleSleep.setMMode(8);
                        arrayList3.add(bleSleep);
                    }
                    arrayList.addAll(arrayList3);
                    arrayList.add(BleSleep.copy$default(list.get(1), 0, 34, 0, 0, 13, null));
                }
            }
            if (!arrayList.isEmpty() && ((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList)).getMMode() != 34) {
                arrayList.add(BleSleep.copy$default((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(arrayList), 0, 34, 0, 0, 13, null));
            }
            return arrayList;
        }

        @aa1
        public final SparseIntArray getSleepStatusDuration(@aa1 List<BleSleep> sleeps) {
            Intrinsics.X0O(sleeps, "sleeps");
            SparseIntArray sparseIntArray = new SparseIntArray();
            int i = 0;
            for (Object obj : sleeps) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.XOX0O0();
                }
                BleSleep bleSleep = (BleSleep) obj;
                if (i < CollectionsKt__CollectionsKt.X11iII1O1(sleeps)) {
                    int mMode = bleSleep.getMMode();
                    sparseIntArray.put(mMode, sparseIntArray.get(mMode) + (sleeps.get(i2).getMTime() - bleSleep.getMTime()));
                }
                i = i2;
            }
            sparseIntArray.put(2, sparseIntArray.get(2) / 60);
            sparseIntArray.put(1, sparseIntArray.get(1) / 60);
            sparseIntArray.put(3, sparseIntArray.get(3) / 60);
            return sparseIntArray;
        }

        private Companion() {
        }

        @aa1
        public final SparseIntArray getSleepStatusDuration(@aa1 List<BleSleep> sleeps, @aa1 List<BleSleep> origin) {
            Intrinsics.X0O(sleeps, "sleeps");
            Intrinsics.X0O(origin, "origin");
            SparseIntArray sparseIntArray = new SparseIntArray();
            for (BleSleep bleSleep : origin) {
                int mMode = bleSleep.getMMode();
                if (mMode == 4) {
                    sparseIntArray.put(4, (bleSleep.getMSoft() << 8) + bleSleep.getMStrong());
                } else if (mMode == 5) {
                    sparseIntArray.put(1, (bleSleep.getMSoft() << 8) + bleSleep.getMStrong());
                } else if (mMode == 6) {
                    sparseIntArray.put(2, (bleSleep.getMSoft() << 8) + bleSleep.getMStrong());
                } else if (mMode == 7) {
                    sparseIntArray.put(3, (bleSleep.getMSoft() << 8) + bleSleep.getMStrong());
                }
            }
            if (sparseIntArray.get(4) != 0) {
                return sparseIntArray;
            }
            SparseIntArray sleepStatusDuration = getSleepStatusDuration(sleeps);
            sleepStatusDuration.put(4, sleepStatusDuration.get(2) + sleepStatusDuration.get(1) + sleepStatusDuration.get(3));
            return sleepStatusDuration;
        }
    }

    public BleSleep() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BleSleep copy$default(BleSleep bleSleep, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = bleSleep.mTime;
        }
        if ((i5 & 2) != 0) {
            i2 = bleSleep.mMode;
        }
        if ((i5 & 4) != 0) {
            i3 = bleSleep.mSoft;
        }
        if ((i5 & 8) != 0) {
            i4 = bleSleep.mStrong;
        }
        return bleSleep.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mMode;
    }

    public final int component3() {
        return this.mSoft;
    }

    public final int component4() {
        return this.mStrong;
    }

    @aa1
    public final BleSleep copy(int i, int i2, int i3, int i4) {
        return new BleSleep(i, i2, i3, i4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mMode = readUInt8();
        this.mSoft = readUInt8();
        this.mStrong = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeInt32$default(this, this.mTime, null, 2, null);
        writeInt8(this.mMode);
        writeInt8(this.mSoft);
        writeInt8(this.mStrong);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSleep)) {
            return false;
        }
        BleSleep bleSleep = (BleSleep) obj;
        return this.mTime == bleSleep.mTime && this.mMode == bleSleep.mMode && this.mSoft == bleSleep.mSoft && this.mStrong == bleSleep.mStrong;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 7;
    }

    public final long getMLocalTime() {
        return BleReadable.Companion.timeToMillis(this.mTime);
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMSoft() {
        return this.mSoft;
    }

    public final int getMStrong() {
        return this.mStrong;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mSoft)) * 31) + Integer.hashCode(this.mStrong);
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMSoft(int i) {
        this.mSoft = i;
    }

    public final void setMStrong(int i) {
        this.mStrong = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    @aa1
    public String toString() {
        return "BleSleep(mTime=" + this.mTime + ", mMode=" + this.mMode + ", mSoft=" + this.mSoft + ", mStrong=" + this.mStrong + ", mLocalTime=" + getMLocalTime() + HexStringBuilder.COMMENT_BEGIN_CHAR + BleReadable.Companion.timeFormat$default(BleReadable.Companion, null, 1, null).format(Long.valueOf(getMLocalTime())) + "))";
    }

    public BleSleep(int i, int i2, int i3, int i4) {
        this.mTime = i;
        this.mMode = i2;
        this.mSoft = i3;
        this.mStrong = i4;
    }

    public /* synthetic */ BleSleep(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
