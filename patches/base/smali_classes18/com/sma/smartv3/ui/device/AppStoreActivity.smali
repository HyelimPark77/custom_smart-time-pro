.class public final Lcom/sma/smartv3/ui/device/AppStoreActivity;
.super Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppStoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStoreActivity.kt\ncom/sma/smartv3/ui/device/AppStoreActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1563#2:433\n1634#2,3:434\n1869#2:437\n774#2:439\n865#2,2:440\n1870#2:444\n1869#2,2:445\n13805#3:438\n13806#3:443\n1#4:442\n*S KotlinDebug\n*F\n+ 1 AppStoreActivity.kt\ncom/sma/smartv3/ui/device/AppStoreActivity\n*L\n393#1:433\n393#1:434,3\n225#1:437\n228#1:439\n228#1:440,2\n225#1:444\n294#1:445,2\n226#1:438\n226#1:443\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAppStoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStoreActivity.kt\ncom/sma/smartv3/ui/device/AppStoreActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1563#2:433\n1634#2,3:434\n1869#2:437\n774#2:439\n865#2,2:440\n1870#2:444\n1869#2,2:445\n13805#3:438\n13806#3:443\n1#4:442\n*S KotlinDebug\n*F\n+ 1 AppStoreActivity.kt\ncom/sma/smartv3/ui/device/AppStoreActivity\n*L\n393#1:433\n393#1:434,3\n225#1:437\n228#1:439\n228#1:440,2\n225#1:444\n294#1:445,2\n226#1:438\n226#1:443\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private freeSizeDeviceStorage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final loadTimeOut:I

.field public mAllAppStoreFragment:Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;

.field private final mAppStoreGameItem:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreDataItem;",
            ">;"
        }
    .end annotation
.end field

.field private final mAppStoreItemList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreItemList;",
            ">;"
        }
    .end annotation
.end field

.field private final mAppStoreToolItem:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreDataItem;",
            ">;"
        }
    .end annotation
.end field

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mMyAppStoreFragment:Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;

.field private final table$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private totalDeviceStorage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;-><init>()V

    const-string v0, "AppStoreActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X011i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X011i;-><init>(Lcom/sma/smartv3/ui/device/AppStoreActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->table$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreGameItem:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreToolItem:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreItemList:Ljava/util/List;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->totalDeviceStorage:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->freeSizeDeviceStorage:Ljava/lang/String;

    const/16 v0, 0xff

    iput v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->loadTimeOut:I

    new-instance v0, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1;-><init>(Lcom/sma/smartv3/ui/device/AppStoreActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/AppStoreActivity;Lcom/szabh/smable3/entity/BleAppInfoList;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->checkAppStoreList$lambda$0(Lcom/sma/smartv3/ui/device/AppStoreActivity;Lcom/szabh/smable3/entity/BleAppInfoList;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/AppStoreActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->table_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AppStoreActivity;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMContext(Lcom/sma/smartv3/ui/device/AppStoreActivity;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method private static final checkAppStoreList$lambda$0(Lcom/sma/smartv3/ui/device/AppStoreActivity;Lcom/szabh/smable3/entity/BleAppInfoList;Ljava/util/List;)Lkotlin/Unit;
    .locals 24

    move-object/from16 v0, p0

    if-eqz p2, :cond_a

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreToolItem:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreGameItem:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreItemList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    move-object/from16 v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " checkAppStoreList it.isNotEmpty()"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/AppStoreFileList;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppStoreFileList;->getAppx()[Lcom/sma/smartv3/model/AppFileDetail;

    move-result-object v2

    if-eqz v2, :cond_0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleAppInfoList;->getMList()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/szabh/smable3/entity/BleAppInfo;

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleAppInfo;->getMPackage()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPackName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPackName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_3

    const-string v6, "if-empty"

    :cond_3
    move-object v8, v6

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppSize()D

    move-result-wide v6

    const/16 v9, 0x400

    int-to-double v11, v9

    mul-double/2addr v6, v11

    double-to-int v11, v6

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppGroupId()Ljava/lang/String;

    move-result-object v6

    const-string v7, "app_group:2"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v13

    new-instance v16, Lcom/szabh/smable3/entity/BleAppInfo;

    const/16 v15, 0x42

    move-object v6, v7

    move-object/from16 v7, v16

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x1

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Lcom/szabh/smable3/entity/BleAppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v7

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppGroupId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreGameItem:Ljava/util/List;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPreImg()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppNewFlag()Z

    move-result v20

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPack()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreBinOnlinePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    new-instance v14, Lcom/sma/smartv3/model/AppStoreDataItem;

    const/16 v22, 0x45

    const/16 v23, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v14 .. v23}, Lcom/sma/smartv3/model/AppStoreDataItem;-><init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_4
    iget-object v6, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreToolItem:Ljava/util/List;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPreImg()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppNewFlag()Z

    move-result v20

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPack()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreBinOnlinePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    new-instance v14, Lcom/sma/smartv3/model/AppStoreDataItem;

    const/16 v22, 0x45

    const/16 v23, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v14 .. v23}, Lcom/sma/smartv3/model/AppStoreDataItem;-><init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v7}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/szabh/smable3/entity/BleAppInfo;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v6}, Lcom/szabh/smable3/entity/BleAppInfo;->setMName(Ljava/lang/String;)V

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleAppInfo;->getMIsGame()I

    move-result v6

    if-nez v6, :cond_6

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreGameItem:Ljava/util/List;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPreImg()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppNewFlag()Z

    move-result v13

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPack()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreBinOnlinePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPackVersion()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v9, v5}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreItemType(Lcom/szabh/smable3/entity/BleAppInfo;Ljava/lang/String;)I

    move-result v14

    new-instance v7, Lcom/sma/smartv3/model/AppStoreDataItem;

    const/4 v15, 0x5

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v16}, Lcom/sma/smartv3/model/AppStoreDataItem;-><init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    iget-object v6, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreToolItem:Ljava/util/List;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPreImg()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppNewFlag()Z

    move-result v13

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPack()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreBinOnlinePath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPackVersion()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v9, v5}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreItemType(Lcom/szabh/smable3/entity/BleAppInfo;Ljava/lang/String;)I

    move-result v14

    new-instance v7, Lcom/sma/smartv3/model/AppStoreDataItem;

    const/4 v15, 0x5

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v16}, Lcom/sma/smartv3/model/AppStoreDataItem;-><init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_7
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " checkAppStoreList it.isEmpty()"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/szabh/smable3/entity/BleAppInfoList;->getMList()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/szabh/smable3/entity/BleAppInfo;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleAppInfo;->getMIsGame()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->XIi00iiXO(I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_8

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreToolItem:Ljava/util/List;

    new-instance v4, Lcom/sma/smartv3/model/AppStoreDataItem;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleAppInfo;->getMPackage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/sma/smartv3/model/FileTransmissionKt;->getAppStoreIcon(Ljava/lang/String;)I

    move-result v6

    invoke-direct {v0, v5, v3}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreItemType(Lcom/szabh/smable3/entity/BleAppInfo;Ljava/lang/String;)I

    move-result v10

    const/16 v11, 0x39

    const/4 v12, 0x0

    move-object v3, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/sma/smartv3/model/AppStoreDataItem;-><init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    iget-object v2, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreGameItem:Ljava/util/List;

    new-instance v4, Lcom/sma/smartv3/model/AppStoreDataItem;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleAppInfo;->getMPackage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/sma/smartv3/model/FileTransmissionKt;->getAppStoreIcon(Ljava/lang/String;)I

    move-result v6

    invoke-direct {v0, v5, v3}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreItemType(Lcom/szabh/smable3/entity/BleAppInfo;Ljava/lang/String;)I

    move-result v10

    const/16 v11, 0x39

    const/4 v12, 0x0

    move-object v3, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/sma/smartv3/model/AppStoreDataItem;-><init>(ILcom/szabh/smable3/entity/BleAppInfo;ILjava/lang/String;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    iget-object v1, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreItemList:Ljava/util/List;

    new-instance v2, Lcom/sma/smartv3/model/AppStoreItemList;

    const v3, 0x7f140155

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v8, "getString(...)"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreToolItem:Ljava/util/List;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/AppStoreItemList;-><init>(Ljava/lang/String;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreItemList:Ljava/util/List;

    new-instance v2, Lcom/sma/smartv3/model/AppStoreItemList;

    const v3, 0x7f140149

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreGameItem:Ljava/util/List;

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/AppStoreItemList;-><init>(Ljava/lang/String;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getMAllAppStoreFragment()Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreItemList:Ljava/util/List;

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;->upData(Ljava/util/List;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getMMyAppStoreFragment()Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;

    move-result-object v1

    iget-object v0, v0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreItemList:Ljava/util/List;

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;->upData(Ljava/util/List;)V

    :cond_a
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method private final getAppStoreBinOnlinePath(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method private final getAppStoreInstallType(Lcom/szabh/smable3/entity/BleAppInfo;)I
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALL:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAppInfo;->getMHide()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    sget-object p1, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALL:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result p1

    return p1

    :cond_1
    sget-object p1, Lcom/sma/smartv3/model/AppStoreItemType;->INSTALLED:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result p1

    return p1
.end method

.method private final getAppStoreItemType(Lcom/szabh/smable3/entity/BleAppInfo;Ljava/lang/String;)I
    .locals 9

    const-string v0, " , "

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_b

    if-nez p2, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAppInfo;->getMVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAppInfo;->getMApiVersion()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_6

    :goto_0
    sget-object v5, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->TAG:Ljava/lang/String;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_3

    move p2, v1

    goto :goto_1

    :cond_3
    move p2, v2

    :goto_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_2

    :cond_4
    move v3, v2

    :goto_2
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    move v1, v2

    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " version.isEmpty = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v5, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreInstallType(Lcom/szabh/smable3/entity/BleAppInfo;)I

    move-result p1

    return p1

    :cond_6
    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->versionToList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, v3}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->versionToList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v4}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->versionToList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_a

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v4, :cond_a

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v4, :cond_7

    goto :goto_4

    :cond_7
    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->versionListToLong(Ljava/util/List;)J

    move-result-wide v3

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->versionListToLong(Ljava/util/List;)J

    move-result-wide v5

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->versionListToLong(Ljava/util/List;)J

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long p2, v7, v0

    if-lez p2, :cond_8

    sget-object p1, Lcom/sma/smartv3/model/AppStoreItemType;->NOT_RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result p1

    return p1

    :cond_8
    cmp-long p2, v3, v5

    if-lez p2, :cond_9

    sget-object p1, Lcom/sma/smartv3/model/AppStoreItemType;->RENEW:Lcom/sma/smartv3/model/AppStoreItemType;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppStoreItemType;->getType()I

    move-result p1

    return p1

    :cond_9
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreInstallType(Lcom/szabh/smable3/entity/BleAppInfo;)I

    move-result p1

    return p1

    :cond_a
    :goto_4
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreInstallType(Lcom/szabh/smable3/entity/BleAppInfo;)I

    move-result p1

    return p1

    :cond_b
    :goto_5
    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->TAG:Ljava/lang/String;

    if-nez p1, :cond_c

    move v5, v1

    goto :goto_6

    :cond_c
    move v5, v2

    :goto_6
    if-nez p2, :cond_d

    goto :goto_7

    :cond_d
    move v1, v2

    :goto_7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " bleAppInfo.isEmpty "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreInstallType(Lcom/szabh/smable3/entity/BleAppInfo;)I

    move-result p1

    return p1
.end method

.method private final getTiTle()[Ljava/lang/String;
    .locals 3

    const v0, 0x7f140146

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f140152

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final table_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AppStoreActivity;)Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    const v0, 0x7f0a0b64

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method

.method private final versionListToLong(Ljava/util/List;)J
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)J"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const/16 v2, 0x18

    shl-long/2addr v0, v2

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    const/16 v4, 0x10

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    const/4 v2, 0x2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    const/16 v4, 0x8

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    const/4 v2, 0x3

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final versionToList(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\."

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final addAppStoreError(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "add_app_store_error"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreList()V

    return-void
.end method

.method public final checkAppStoreList(Lcom/szabh/smable3/entity/BleAppInfoList;)V
    .locals 2
    .param p1    # Lcom/szabh/smable3/entity/BleAppInfoList;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    sget-object v0, Lcom/sma/smartv3/model/AppStoreFileManager;->INSTANCE:Lcom/sma/smartv3/model/AppStoreFileManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i001O;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/i001O;-><init>(Lcom/sma/smartv3/ui/device/AppStoreActivity;Lcom/szabh/smable3/entity/BleAppInfoList;)V

    const-string p1, "1"

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/model/AppStoreFileManager;->getAppStoreFileList(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final getAppStoreList()V
    .locals 8

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->APP_OP:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void
.end method

.method public final getFreeSizeDeviceStorage()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->freeSizeDeviceStorage:Ljava/lang/String;

    return-object v0
.end method

.method public final getMAllAppStoreFragment()Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAllAppStoreFragment:Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mAllAppStoreFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMAppStoreGameItem()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreDataItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreGameItem:Ljava/util/List;

    return-object v0
.end method

.method public final getMAppStoreItemList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreItemList;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreItemList:Ljava/util/List;

    return-object v0
.end method

.method public final getMAppStoreToolItem()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/AppStoreDataItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAppStoreToolItem:Ljava/util/List;

    return-object v0
.end method

.method public final getMMyAppStoreFragment()Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mMyAppStoreFragment:Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mMyAppStoreFragment"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSDCardInfo()V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XI1O1111i()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->SDCARD_INFO:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final getTable()Lcom/google/android/material/tabs/TabLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    return-object v0
.end method

.method public final getTotalDeviceStorage()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->totalDeviceStorage:Ljava/lang/String;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initFragments()Ljava/util/List;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->setMAllAppStoreFragment(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->setMMyAppStoreFragment(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getMAllAppStoreFragment()Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getMMyAppStoreFragment()Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 8

    invoke-super {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140d37

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    const v1, 0x7f060792

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMFragmentPagerAdapter()Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getTiTle()[Ljava/lang/String;

    move-result-object v1

    check-cast v1, [Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerAdapter;->setTitles([Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/viewpager/BaseFragmentPagerActivity;->getMViewPager()Landroidx/viewpager/widget/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Landroidx/viewpager/widget/ViewPager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getAppStoreList()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->getSDCardInfo()V

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->SDCARD_INFO:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-class v4, Lcom/szabh/smable3/entity/BleSDCardInfo;

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSDCardInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSDCardInfo;->getMTotalSize()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->watchFreeSpaceToText(Lcom/szabh/smable3/entity/BleSDCardInfo;)V

    :cond_0
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0033

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AppStoreActivity$mBleHandleCallback$1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->i0X1iIO()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f1412fd

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/AppStoreActivity;->onHandleBackPressed()V

    return-void
.end method

.method public final setFreeSizeDeviceStorage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->freeSizeDeviceStorage:Ljava/lang/String;

    return-void
.end method

.method public final setMAllAppStoreFragment(Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mAllAppStoreFragment:Lcom/sma/smartv3/ui/device/fragment/AllAppStoreFragment;

    return-void
.end method

.method public final setMMyAppStoreFragment(Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->mMyAppStoreFragment:Lcom/sma/smartv3/ui/device/fragment/MyAppStoreFragment;

    return-void
.end method

.method public final setTotalDeviceStorage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->totalDeviceStorage:Ljava/lang/String;

    return-void
.end method

.method public final watchFreeSpaceToText(Lcom/szabh/smable3/entity/BleSDCardInfo;)V
    .locals 12
    .param p1    # Lcom/szabh/smable3/entity/BleSDCardInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleSDCardInfo;->getMFreeSize()I

    move-result v2

    int-to-long v2, v2

    goto :goto_0

    :cond_0
    move-wide v2, v0

    :goto_0
    const-wide/16 v4, 0x400

    mul-long/2addr v2, v4

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleSDCardInfo;->getMTotalSize()I

    move-result p1

    int-to-long v6, p1

    goto :goto_1

    :cond_1
    move-wide v6, v0

    :goto_1
    mul-long/2addr v6, v4

    const-wide/32 v4, 0x20000000

    cmp-long p1, v6, v4

    const/high16 v4, 0x40000000    # 2.0f

    if-gtz p1, :cond_2

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    goto :goto_3

    :cond_2
    const-wide/32 v8, 0x40000000

    cmp-long p1, v6, v8

    if-gtz p1, :cond_3

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    goto :goto_3

    :cond_3
    int-to-long v8, v4

    rem-long v10, v6, v8

    cmp-long p1, v10, v0

    if-nez p1, :cond_4

    div-long/2addr v6, v8

    :goto_2
    long-to-double v0, v6

    goto :goto_3

    :cond_4
    div-long/2addr v6, v8

    const-wide/16 v0, 0x1

    add-long/2addr v6, v0

    goto :goto_2

    :goto_3
    int-to-double v4, v4

    mul-double/2addr v4, v0

    double-to-long v4, v4

    const/4 p1, 0x0

    invoke-static {v4, v5, p1}, Lcom/blankj/utilcode/util/ConvertUtils;->byte2FitMemorySize(JI)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    const/16 v5, 0x8

    int-to-double v5, v5

    mul-double/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "(%.0fGb)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->totalDeviceStorage:Ljava/lang/String;

    invoke-static {v2, v3, p1}, Lcom/blankj/utilcode/util/ConvertUtils;->byte2FitMemorySize(JI)Ljava/lang/String;

    move-result-object p1

    const-string v0, "byte2FitMemorySize(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AppStoreActivity;->freeSizeDeviceStorage:Ljava/lang/String;

    return-void
.end method
