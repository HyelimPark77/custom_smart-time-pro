.class public final Lcom/sma/smartv3/ui/device/model/ResourceRenewal;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/model/ResourceRenewal$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResourceRenewal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceRenewal.kt\ncom/sma/smartv3/ui/device/model/ResourceRenewal\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,172:1\n1869#2:173\n1870#2:176\n13805#3,2:174\n*S KotlinDebug\n*F\n+ 1 ResourceRenewal.kt\ncom/sma/smartv3/ui/device/model/ResourceRenewal\n*L\n115#1:173\n115#1:176\n116#1:174,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nResourceRenewal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceRenewal.kt\ncom/sma/smartv3/ui/device/model/ResourceRenewal\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,172:1\n1869#2:173\n1870#2:176\n13805#3,2:174\n*S KotlinDebug\n*F\n+ 1 ResourceRenewal.kt\ncom/sma/smartv3/ui/device/model/ResourceRenewal\n*L\n115#1:173\n115#1:176\n116#1:174,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/device/model/ResourceRenewal$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final QURAN_AUDIO:I = 0x1

.field public static final QURAN_TEXT:I = 0x0

.field public static final RESOURCE_RENEWAL:I = -0x1

.field public static final SACRAL_PUNISHMENT:I = 0x2


# instance fields
.field private final renewalLiveData:Landroidx/lifecycle/MutableLiveData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/AppFileDetail;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/model/ResourceRenewal$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->Companion:Lcom/sma/smartv3/ui/device/model/ResourceRenewal$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->renewalLiveData:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method

.method public static synthetic OXO1(ILcom/sma/smartv3/ui/device/model/ResourceRenewal;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->postData$lambda$0(ILcom/sma/smartv3/ui/device/model/ResourceRenewal;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final getQuranAudioData(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->postData(I)V

    return-void
.end method

.method private final getQuranTextData(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->postData(I)V

    return-void
.end method

.method private final getResourceRenewalData()V
    .locals 21

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/sma/smartv3/model/AppFileDetail;

    const v2, 0x7f141154

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/16 v17, 0x1ffc

    const/16 v18, 0x0

    const-string v3, "0"

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v1 .. v18}, Lcom/sma/smartv3/model/AppFileDetail;-><init>(Ljava/lang/String;Ljava/lang/String;DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/sma/smartv3/model/AppFileDetail;

    const v1, 0x7f141153

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const/16 v18, 0x1ffc

    const/16 v19, 0x0

    const-string v4, "1"

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v2 .. v19}, Lcom/sma/smartv3/model/AppFileDetail;-><init>(Ljava/lang/String;Ljava/lang/String;DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/sma/smartv3/model/AppFileDetail;

    const v1, 0x7f1411b9

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    const/16 v19, 0x1ffc

    const/16 v20, 0x0

    const-string v5, "2"

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v3 .. v20}, Lcom/sma/smartv3/model/AppFileDetail;-><init>(Ljava/lang/String;Ljava/lang/String;DJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->renewalLiveData:Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {v2, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final getSacralPunishmentData(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->postData(I)V

    return-void
.end method

.method private final postData(I)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/model/AppStoreFileManager;->INSTANCE:Lcom/sma/smartv3/model/AppStoreFileManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nl3;

    invoke-direct {v1, p1, p0}, Lcom/android/mltcode/paycertificationapi/nl3;-><init>(ILcom/sma/smartv3/ui/device/model/ResourceRenewal;)V

    const-string p1, "4"

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/model/AppStoreFileManager;->getAppStoreFileList(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final postData$lambda$0(ILcom/sma/smartv3/ui/device/model/ResourceRenewal;Ljava/util/List;)Lkotlin/Unit;
    .locals 8

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "postData "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/AppStoreFileList;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppStoreFileList;->getAppx()[Lcom/sma/smartv3/model/AppFileDetail;

    move-result-object v2

    if-eqz v2, :cond_0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    add-int/lit8 v6, p0, 0x1

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppStoreFileList;->getGroupId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-object p0, p1, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->renewalLiveData:Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->renewalLiveData:Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    :goto_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final downloadFile(ILcom/sma/smartv3/model/AppFileDetail;)V
    .locals 8
    .param p2    # Lcom/sma/smartv3/model/AppFileDetail;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "appFileDetail"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPack()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-object v1, Lcom/sma/smartv3/model/AppStoreFileManager;->INSTANCE:Lcom/sma/smartv3/model/AppStoreFileManager;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AppFileDetail;->getAppPackName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->getBleType(I)I

    move-result v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/model/AppStoreFileManager;->downloadAppFile$default(Lcom/sma/smartv3/model/AppStoreFileManager;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final getBleType(I)I
    .locals 2

    const/4 v0, 0x5

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x7

    return p1

    :cond_1
    const/4 p1, 0x6

    return p1

    :cond_2
    return v0
.end method

.method public final getData(I)V
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->getResourceRenewalData()V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->getSacralPunishmentData(I)V

    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->getQuranAudioData(I)V

    return-void

    :cond_2
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->getQuranTextData(I)V

    return-void

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->getResourceRenewalData()V

    return-void
.end method

.method public final getLayoutId(I)I
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const p1, 0x7f0d0f0b

    return p1

    :cond_0
    const p1, 0x7f0d0f08

    return p1
.end method

.method public final getRenewalLiveData()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/AppFileDetail;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/ResourceRenewal;->renewalLiveData:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final getTitleString(I)Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/4 v0, -0x1

    const v1, 0x7f14119b

    if-eq p1, v0, :cond_3

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const p1, 0x7f1411b9

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const p1, 0x7f141153

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const p1, 0x7f141154

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
