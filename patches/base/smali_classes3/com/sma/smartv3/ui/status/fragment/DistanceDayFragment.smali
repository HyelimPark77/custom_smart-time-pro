.class public final Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;
.super Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDistanceDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistanceDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceDayFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,132:1\n19#2:133\n15#2:134\n*S KotlinDebug\n*F\n+ 1 DistanceDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceDayFragment\n*L\n20#1:133\n20#1:134\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDistanceDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistanceDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceDayFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,132:1\n19#2:133\n15#2:134\n*S KotlinDebug\n*F\n+ 1 DistanceDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceDayFragment\n*L\n20#1:133\n20#1:134\n*E\n"
    }
.end annotation


# instance fields
.field private final formatDecimal:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;-><init>()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

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

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->iIX0i()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "%.2f"

    goto :goto_1

    :cond_1
    const-string v1, "%.1f"

    :goto_1
    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->formatDecimal:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public filterData(Ljava/util/List;)V
    .locals 17
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "data"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->filterData(Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v3, "format(...)"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    sget-object v8, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v8, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->formatDecimal:Ljava/lang/String;

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v9

    invoke-static {v7, v9, v7, v5, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v6

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v8

    sget-object v9, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->formatDecimal:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v2

    div-int/lit16 v2, v2, 0x2710

    iget-object v10, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v10

    invoke-static {v2, v10, v7, v5, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getFilterData()Ljava/util/LinkedHashMap;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/ArrayList;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v13

    cmp-long v11, v13, v11

    if-gtz v11, :cond_2

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getFilterData()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v8, v7

    move v9, v8

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_4

    const/4 v10, 0x0

    goto :goto_5

    :cond_4
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const-string v12, "iterator(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move v12, v7

    move v13, v12

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    const-string v15, "next(...)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v14}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v14

    div-int/lit16 v14, v14, 0x2710

    if-gt v13, v14, :cond_6

    if-nez v13, :cond_5

    if-eqz v9, :cond_5

    if-lt v14, v9, :cond_5

    sub-int v13, v14, v9

    goto :goto_4

    :cond_5
    sub-int v13, v14, v13

    :goto_4
    add-int/2addr v12, v13

    :cond_6
    move v13, v14

    goto :goto_3

    :cond_7
    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v9

    invoke-static {v12, v9, v7, v5, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v9

    invoke-static {v10}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v10

    div-int/lit16 v10, v10, 0x2710

    move/from16 v16, v10

    move v10, v9

    move/from16 v9, v16

    :goto_5
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getValues()Ljava/util/List;

    move-result-object v11

    new-instance v12, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v13, v8

    invoke-direct {v12, v13, v10}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v8, v6

    goto :goto_2

    :cond_8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, v7

    move v8, v2

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v9

    div-int/lit16 v9, v9, 0x2710

    if-gt v8, v9, :cond_9

    sub-int v8, v9, v8

    add-int/2addr v2, v8

    :cond_9
    move v8, v9

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getOneValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    sget-object v8, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v8, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->formatDecimal:Ljava/lang/String;

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v9

    invoke-static {v2, v9, v7, v5, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final getFormatDecimal()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->formatDecimal:Ljava/lang/String;

    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081287

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getValueUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getOneTV()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f141361

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTotalUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTwoTV()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140382

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getTwoUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0601de

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0601df

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->OI1IiOO1i(II)V

    return-void
.end method

.method public setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "Distance day Data"

    return-object v0
.end method

.method public updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 3
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/DistanceDayFragment;->formatDecimal:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "format(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
