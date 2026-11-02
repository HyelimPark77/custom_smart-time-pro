.class public final Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;
.super Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportRecordsV3Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsV3Fragment.kt\ncom/sma/smartv3/ui/status/SportRecordsV3Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,150:1\n19#2:151\n15#2:152\n*S KotlinDebug\n*F\n+ 1 SportRecordsV3Fragment.kt\ncom/sma/smartv3/ui/status/SportRecordsV3Fragment\n*L\n77#1:151\n77#1:152\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportRecordsV3Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsV3Fragment.kt\ncom/sma/smartv3/ui/status/SportRecordsV3Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,150:1\n19#2:151\n15#2:152\n*S KotlinDebug\n*F\n+ 1 SportRecordsV3Fragment.kt\ncom/sma/smartv3/ui/status/SportRecordsV3Fragment\n*L\n77#1:151\n77#1:152\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "SportRecordsV3Fragment"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;->Companion:Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;-><init>()V

    return-void
.end method

.method private static final getSportRecordList$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->showCalendarPopop()V

    return-void
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;->getSportRecordList$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public getItemLayout()I
    .locals 1

    const v0, 0x7f0d107c

    return v0
.end method

.method public getSportRecordList()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->ALL:Lcom/sma/smartv3/util/TimePeriod;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getBtnPre()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getBtnNext()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getSportRecordList()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140113

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMOffset()I

    move-result v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->update(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMOffset()I

    move-result v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OII(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/o45;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/o45;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsV3Fragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->init(Landroid/os/Bundle;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->X1ii(Ljava/lang/Object;)V

    return-void
.end method

.method public initView()V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e7f

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->onDestroy()V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->OiIIX101O(Ljava/lang/Object;)V

    return-void
.end method

.method public onTimePeriodChange(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/util/List;
    .locals 7
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/util/TimePeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "I",
            "Lcom/sma/smartv3/util/TimePeriod;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;"
        }
    .end annotation

    const-string v0, "calendar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timePeriod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getSportRecordList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setCompetitionSelectionTime(Z)V

    invoke-static {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;I)[J

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result p2

    const/4 p3, -0x1

    const/4 v1, 0x0

    if-le p2, p3, :cond_0

    aget-wide p2, p1, v1

    aget-wide v0, p1, v0

    const/16 p1, 0x74

    invoke-static {p2, p3, v0, v1, p1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordList(JJI)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_0

    :cond_0
    aget-wide p2, p1, v1

    aget-wide v2, p1, v0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-wide v0, p2

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordList$default(JJIILjava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->setSportRecordList(Ljava/util/ArrayList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;->getSportRecordList()Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public setItemView(Lcom/angcyo/dsladapter/DslViewHolder;Lcom/sma/smartv3/model/SportRecordItemCommonData;Lcom/sma/smartv3/model/SportRecordData;)V
    .locals 40
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/SportRecordItemCommonData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/model/SportRecordData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const-string v3, "itemHolder"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "itemData"

    move-object/from16 v4, p2

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sportRecordData"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f0a098e

    invoke-virtual {v1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v4

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "getContext(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v2}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutImage(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v4

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/a15;->iO(I)Z

    move-result v4

    if-eqz v4, :cond_1

    if-eqz v3, :cond_2

    const v4, 0x7f0816fd

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_2

    const v4, 0x7f0816fc

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_2
    :goto_0
    const v3, 0x7f0a0990

    invoke-virtual {v1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_3

    sget-object v4, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/android/mltcode/paycertificationapi/q62;->i01OOiI(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    const v3, 0x7f0a098f

    invoke-virtual {v1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_4

    invoke-static {v6, v5, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X1(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v7

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    sget-object v3, Lcom/android/mltcode/paycertificationapi/hu4;->OXO1:Lcom/android/mltcode/paycertificationapi/hu4;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v7

    invoke-virtual {v3, v7}, Lcom/android/mltcode/paycertificationapi/hu4;->O10IXXX0X(I)Z

    move-result v3

    const v7, 0x7f140d64

    const v8, 0x7f0a098d

    const v9, 0x7f0a0991

    if-eqz v3, :cond_7

    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v10, Lcom/sma/smartv3/model/AppUser;

    const v38, 0x7ffffff

    const/16 v39, 0x0

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

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v10 .. v39}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lcom/google/gson/Gson;

    invoke-direct {v11}, Lcom/google/gson/Gson;-><init>()V

    const-class v12, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3, v13}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3, v12}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    move-object v10, v3

    :goto_1
    check-cast v10, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMDistance()I

    move-result v3

    invoke-virtual {v10}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v11

    const/4 v12, 0x4

    invoke-static {v3, v11, v6, v12, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v9}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v10}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v6

    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v6

    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    invoke-virtual {v1, v8}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMCalorie()I

    move-result v4

    div-int/lit16 v4, v4, 0x3e8

    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMDuration()I

    move-result v7

    mul-int/lit16 v7, v7, 0x3e8

    invoke-static {v7}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " | "

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v1, v9}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMCalorie()I

    move-result v4

    div-int/lit16 v4, v4, 0x3e8

    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    invoke-virtual {v1, v8}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMDuration()I

    move-result v4

    mul-int/lit16 v4, v4, 0x3e8

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    :goto_2
    const v3, 0x7f0a001f

    invoke-virtual {v1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v3

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result v2

    if-ne v2, v5, :cond_a

    const v2, 0x7f081776

    goto :goto_3

    :cond_a
    const v2, 0x7f081768

    :goto_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_b
    return-void
.end method
