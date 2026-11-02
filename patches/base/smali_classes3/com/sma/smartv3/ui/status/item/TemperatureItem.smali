.class public final Lcom/sma/smartv3/ui/status/item/TemperatureItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTemperatureItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureItem.kt\ncom/sma/smartv3/ui/status/item/TemperatureItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,62:1\n19#2:63\n15#2:64\n*S KotlinDebug\n*F\n+ 1 TemperatureItem.kt\ncom/sma/smartv3/ui/status/item/TemperatureItem\n*L\n43#1:63\n43#1:64\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTemperatureItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureItem.kt\ncom/sma/smartv3/ui/status/item/TemperatureItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,62:1\n19#2:63\n15#2:64\n*S KotlinDebug\n*F\n+ 1 TemperatureItem.kt\ncom/sma/smartv3/ui/status/item/TemperatureItem\n*L\n43#1:63\n43#1:64\n*E\n"
    }
.end annotation


# instance fields
.field private final initEvent:Z

.field private final mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private tempLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

.field private tempLastValue:Lcom/sma/smartv3/view/text/DINCondBold;

.field private tempTitle:Lcom/sma/smartv3/view/text/PFMedium;

.field private tmpUnit:Lcom/sma/smartv3/view/text/PFRegular;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->temperatureDao()Lcom/sma/smartv3/db/dao/TemperatureDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->initEvent:Z

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0b7e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->tempLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0b7f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->tempLastValue:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0bbc

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/PFRegular;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->tmpUnit:Lcom/sma/smartv3/view/text/PFRegular;

    const v0, 0x7f0a0b82

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Lcom/sma/smartv3/view/text/PFMedium;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->tempTitle:Lcom/sma/smartv3/view/text/PFMedium;

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 33

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->tempTitle:Lcom/sma/smartv3/view/text/PFMedium;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "tempTitle"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v3

    if-eqz v3, :cond_1

    const v3, 0x7f140235

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    const v3, 0x7f141316

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/model/AppUser;

    const v31, 0x7ffffff

    const/16 v32, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v3 .. v32}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    move-object v3, v1

    :goto_1
    check-cast v3, Lcom/sma/smartv3/model/AppUser;

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    invoke-interface {v1}, Lcom/sma/smartv3/db/dao/TemperatureDao;->getLastData()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    const-string v5, "tempLastValue"

    const-string v6, "tempLastTime"

    const/4 v7, 0x1

    if-eqz v4, :cond_5

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->tempLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_3

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_3
    const v4, 0x7f1403bc

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->tempLastValue:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_4
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(I)V

    goto :goto_3

    :cond_5
    iget-object v4, v0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->tempLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v4, :cond_6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_6
    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Temperature;->getMTime()J

    move-result-wide v8

    invoke-static {v2, v7, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v6

    invoke-static {v8, v9, v6}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->tempLastValue:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v4, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_7
    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Temperature;->getMTemperature()I

    move-result v1

    int-to-float v1, v1

    const/high16 v5, 0x41200000    # 10.0f

    div-float/2addr v1, v5

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->II1Xi0(I)I

    move-result v5

    if-ne v5, v7, :cond_8

    move v5, v7

    goto :goto_2

    :cond_8
    const/4 v5, 0x0

    :goto_2
    invoke-static {v1, v5}, Lcom/android/mltcode/paycertificationapi/cp5;->i010I(FZ)F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->tmpUnit:Lcom/sma/smartv3/view/text/PFRegular;

    if-nez v1, :cond_9

    const-string v1, "tmpUnit"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_4

    :cond_9
    move-object v2, v1

    :goto_4
    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->II1Xi0(I)I

    move-result v1

    if-ne v1, v7, :cond_a

    const v1, 0x7f140bad

    goto :goto_5

    :cond_a
    const v1, 0x7f1403da

    :goto_5
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1080

    return v0
.end method

.method public final onTemperatureChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "temperature_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onTemperatureChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/TemperatureItem;->initView()V

    return-void
.end method
