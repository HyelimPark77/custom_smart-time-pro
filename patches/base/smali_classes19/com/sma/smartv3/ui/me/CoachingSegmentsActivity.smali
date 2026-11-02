.class public final Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/szabh/smable3/entity/BleCoachingSegment;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoachingSegmentsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingSegmentsActivity.kt\ncom/sma/smartv3/ui/me/CoachingSegmentsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,206:1\n18#2,2:207\n15#2:209\n18#2,2:211\n15#2:213\n18#2,2:214\n15#2:216\n11#2,2:217\n23#2:238\n18#2,2:239\n15#2:241\n11#2,2:243\n24#2:245\n1#3:210\n1#3:226\n1#3:242\n173#4,7:219\n180#4,3:227\n143#4,7:230\n183#4:237\n*S KotlinDebug\n*F\n+ 1 CoachingSegmentsActivity.kt\ncom/sma/smartv3/ui/me/CoachingSegmentsActivity\n*L\n93#1:207,2\n93#1:209\n159#1:211,2\n159#1:213\n161#1:214,2\n161#1:216\n179#1:217,2\n201#1:238\n201#1:239,2\n201#1:241\n201#1:243,2\n201#1:245\n180#1:226\n201#1:242\n180#1:219,7\n180#1:227,3\n180#1:230,7\n180#1:237\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCoachingSegmentsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingSegmentsActivity.kt\ncom/sma/smartv3/ui/me/CoachingSegmentsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,206:1\n18#2,2:207\n15#2:209\n18#2,2:211\n15#2:213\n18#2,2:214\n15#2:216\n11#2,2:217\n23#2:238\n18#2,2:239\n15#2:241\n11#2,2:243\n24#2:245\n1#3:210\n1#3:226\n1#3:242\n173#4,7:219\n180#4,3:227\n143#4,7:230\n183#4:237\n*S KotlinDebug\n*F\n+ 1 CoachingSegmentsActivity.kt\ncom/sma/smartv3/ui/me/CoachingSegmentsActivity\n*L\n93#1:207,2\n93#1:209\n159#1:211,2\n159#1:213\n161#1:214,2\n161#1:216\n179#1:217,2\n201#1:238\n201#1:239,2\n201#1:241\n201#1:243,2\n201#1:245\n180#1:226\n201#1:242\n180#1:219,7\n180#1:227,3\n180#1:230,7\n180#1:237\n*E\n"
    }
.end annotation


# instance fields
.field private mDeleteFailedPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mDragRect:Landroid/graphics/Rect;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mIndex:I

.field private final titleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOXI;-><init>(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->titleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mDragRect:Landroid/graphics/Rect;

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mIndex:I

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->titleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->onBottomClick$lambda$0(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$checkCount(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->checkCount()V

    return-void
.end method

.method public static final synthetic access$getMContext(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMDeleteFailedPopup$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Lcom/android/mltcode/paycertificationapi/go0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mDeleteFailedPopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-object p0
.end method

.method public static final synthetic access$getMDeletePopup$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Lcom/android/mltcode/paycertificationapi/go0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-object p0
.end method

.method public static final synthetic access$getMDragRect$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Landroid/graphics/Rect;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mDragRect:Landroid/graphics/Rect;

    return-object p0
.end method

.method public static final synthetic access$getMIndex$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mIndex:I

    return p0
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setMDeleteFailedPopup$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;Lcom/android/mltcode/paycertificationapi/go0;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mDeleteFailedPopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-void
.end method

.method public static final synthetic access$setMDeletePopup$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;Lcom/android/mltcode/paycertificationapi/go0;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-void
.end method

.method public static final synthetic access$setMIndex$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mIndex:I

    return-void
.end method

.method public static final synthetic access$toEdit(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->toEdit(I)V

    return-void
.end method

.method private final checkCount()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->getTitleRight()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->Ii0i()I

    move-result v2

    if-ge v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private final getTitleRight()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->titleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final newSegment()Lcom/szabh/smable3/entity/BleCoachingSegment;
    .locals 9

    new-instance v0, Lcom/szabh/smable3/entity/BleCoachingSegment;

    sget-object v1, Lcom/szabh/smable3/entity/CompletionCondition;->DURATION:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v1

    sget-object v2, Lcom/szabh/smable3/entity/SegmentActivity;->TIMER:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v3

    sget-object v2, Lcom/szabh/smable3/entity/Stage;->GO_FOR:Lcom/szabh/smable3/entity/Stage;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v4

    const/16 v7, 0x10

    const/4 v8, 0x0

    const-string v2, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final onBottomClick$lambda$0(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    move-object v2, v0

    check-cast v2, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/szabh/smable3/entity/BleCoaching;->setMSegments(Ljava/util/List;)V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final titleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final toEdit(I)V
    .locals 3

    iput p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mIndex:I

    if-gez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->newSegment()Lcom/szabh/smable3/entity/BleCoachingSegment;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/szabh/smable3/entity/BleCoachingSegment;

    :goto_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-class v1, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mIndex:I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/CoachingSegmentEditActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleCoachingSegment;I)V
    .locals 4
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/BleCoachingSegment;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/szabh/smable3/entity/BleCoachingSegment;

    .line 3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    .line 4
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleCoachingSegment;->getMActivity()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ic_segment_activity"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "drawable"

    const v3, 0x7f081062

    .line 5
    invoke-static {v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/X1OOO;->OXO1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    const v1, 0x7f0a060b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/ug6;->XXI(II)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 6
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    .line 7
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleCoachingSegment;->getMStage()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "segment_stage"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "string"

    const v3, 0x7f14120a

    .line 8
    invoke-static {v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/X1OOO;->OXO1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    const v1, 0x7f0a0d13

    invoke-static {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/vg6;->XO0O10(Lcom/android/mltcode/paycertificationapi/ug6;II)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 9
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleCoachingSegment;->getMName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt__StringsKt;->i0XI0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, p3, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v1, 0x7f140306

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    const v1, 0x7f0a0cc7

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    const v0, 0x7f0a0270

    .line 10
    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CompletionValueView;

    .line 11
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleCoachingSegment;->getMCompletionCondition()I

    move-result v1

    .line 12
    sget-object v2, Lcom/szabh/smable3/entity/CompletionCondition;->DURATION:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v2

    if-eq v1, v2, :cond_3

    sget-object v2, Lcom/szabh/smable3/entity/CompletionCondition;->DURATION_IN_HR_ZONE:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v2

    if-ne v1, v2, :cond_1

    goto :goto_0

    .line 13
    :cond_1
    sget-object v2, Lcom/szabh/smable3/entity/CompletionCondition;->MANUAL:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v2

    if-eq v1, v2, :cond_4

    .line 14
    sget-object v2, Lcom/szabh/smable3/entity/CompletionCondition;->HR_BELOW:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v2

    if-eq v1, v2, :cond_2

    sget-object v2, Lcom/szabh/smable3/entity/CompletionCondition;->HR_ABOVE:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v2

    if-ne v1, v2, :cond_4

    .line 15
    :cond_2
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleCoachingSegment;->getMCompletionValue()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/sma/smartv3/view/CompletionValueView;->setMBpm(I)V

    goto :goto_1

    .line 16
    :cond_3
    :goto_0
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleCoachingSegment;->getMCompletionValue()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/sma/smartv3/view/CompletionValueView;->setMDuration(I)V

    :cond_4
    :goto_1
    const p2, 0x7f0a0b50

    .line 17
    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/swipelist/SwipeLayout;

    const/4 p2, 0x1

    .line 18
    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->O00(Z)V

    .line 19
    new-instance p2, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;

    invoke-direct {p2, p0, p3}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;I)V

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->setSwipeListener(Lcom/sma/smartv3/view/swipelist/SwipeLayout$XIi00iiXO;)V

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleCoachingSegment;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCoachingSegment;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleCoaching;->getMSegments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140307

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f080ff8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.view.swipelist.DragListView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/swipelist/DragListView;

    new-instance v1, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/swipelist/DragListView;->setDragItemListener(Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->checkCount()V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ece

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d004a

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p1, -0x1

    if-ne p2, p1, :cond_3

    iget p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mIndex:I

    const-class p2, Lcom/szabh/smable3/entity/BleCoachingSegment;

    if-gez p1, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    sget-object p3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p3

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_0

    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p3

    :cond_0
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    iget p3, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->mIndex:I

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_2
    invoke-interface {p1, p3, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->checkCount()V

    :cond_3
    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iI0OII;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/iI0OII;-><init>(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

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

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, -0x1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->toEdit(I)V

    return-void
.end method
