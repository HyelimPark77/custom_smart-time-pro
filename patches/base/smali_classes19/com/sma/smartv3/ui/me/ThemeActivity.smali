.class public Lcom/sma/smartv3/ui/me/ThemeActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private adapterPostDelay:J

.field private final nowTheme:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    const-string v0, "Theme"

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ThemeActivity;->TAG:Ljava/lang/String;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "SELECT_THEME"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/me/ThemeActivity;->nowTheme:I

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IX0iIX()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0xc8

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x32

    :goto_0
    iput-wide v0, p0, Lcom/sma/smartv3/ui/me/ThemeActivity;->adapterPostDelay:J

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$1$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/me/ThemeActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0(Lcom/sma/smartv3/ui/me/ThemeActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$0(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$0$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$0$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$3$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$1(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$2$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$1$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$2$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$2(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$3$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/me/ThemeActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/ThemeActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onInitBaseLayoutAfter$lambda$0$0$0$3(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getItemSelectorHelper()Lcom/angcyo/dsladapter/ItemSelectorHelper;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/ItemSelectorHelper;->X11iII1O1(I)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    iget-wide v0, p0, Lcom/sma/smartv3/ui/me/ThemeActivity;->adapterPostDelay:J

    new-instance v2, Lcom/android/mltcode/paycertificationapi/dq5;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/dq5;-><init>(Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0(Lcom/sma/smartv3/ui/me/ThemeActivity;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yp5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yp5;-><init>(Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jq5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jq5;-><init>(Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    const v1, 0x7f0d0f2a

    invoke-static {p1, v1, v0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kq5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kq5;-><init>(Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-static {p1, v1, v0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lq5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/lq5;-><init>(Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-static {p1, v1, v0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mq5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mq5;-><init>(Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-static {p1, v1, v0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$0(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/ThemeActivity;->isThemeSelect(I)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsSelected(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hq5;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/hq5;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iq5;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/iq5;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$0$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0558

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/16 p0, 0x8

    :goto_0
    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    const p0, 0x7f0a0ba8

    invoke-virtual {p1, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f140c01

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f06024d

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    const p0, 0x7f0a0ba7

    invoke-virtual {p1, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_3

    const p1, 0x7f08159c

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_3
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$0$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p2, v2, v0, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->updateItemSelector$default(Lcom/angcyo/dsladapter/DslAdapterItem;ZZILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Lcom/sma/smartv3/ui/me/ThemeActivity;->updateTheme(I)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$1(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/ThemeActivity;->isThemeSelect(I)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsSelected(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/eq5;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/eq5;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fq5;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/fq5;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$1$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0558

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/16 p0, 0x8

    :goto_0
    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    const p0, 0x7f0a0ba8

    invoke-virtual {p1, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f1403b3

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f06024d

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    const p0, 0x7f0a0ba7

    invoke-virtual {p1, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_3

    const p1, 0x7f08159a

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_3
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$1$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p2

    const/4 v0, 0x1

    xor-int/2addr p2, v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, p2, v3, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterItem;->updateItemSelector$default(Lcom/angcyo/dsladapter/DslAdapterItem;ZZILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/me/ThemeActivity;->updateTheme(I)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$2(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bq5;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/bq5;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cq5;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/cq5;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$2$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "<unused var>"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x2

    invoke-virtual {p1, p3}, Lcom/sma/smartv3/ui/me/ThemeActivity;->isThemeSelect(I)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsSelected(Z)V

    const p1, 0x7f0a0558

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/16 p0, 0x8

    :goto_0
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    const p0, 0x7f0a0ba8

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const p3, 0x7f140e16

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f06024d

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    const p0, 0x7f0a0ba7

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_3

    const p1, 0x7f08159b

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_3
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$2$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p2, v0, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->updateItemSelector$default(Lcom/angcyo/dsladapter/DslAdapterItem;ZZILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Lcom/sma/smartv3/ui/me/ThemeActivity;->updateTheme(I)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$3(Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zp5;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/zp5;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/aq5;

    invoke-direct {v0, p1, p0}, Lcom/android/mltcode/paycertificationapi/aq5;-><init>(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$3$0(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    const-string p3, "itemHolder"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "<unused var>"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x3

    invoke-virtual {p1, p3}, Lcom/sma/smartv3/ui/me/ThemeActivity;->isThemeSelect(I)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsSelected(Z)V

    const p1, 0x7f0a0558

    invoke-virtual {p2, p1}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/16 p0, 0x8

    :goto_0
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    const p0, 0x7f0a0ba8

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const p3, 0x7f14024f

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f06024d

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    const p0, 0x7f0a0ba7

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_3

    const p1, 0x7f081599

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_3
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onInitBaseLayoutAfter$lambda$0$0$0$3$1(Lcom/angcyo/dsladapter/DslAdapterItem;Lcom/sma/smartv3/ui/me/ThemeActivity;Landroid/view/View;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->getItemIsSelected()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p2, v2, v0, v1}, Lcom/angcyo/dsladapter/DslAdapterItem;->updateItemSelector$default(Lcom/angcyo/dsladapter/DslAdapterItem;ZZILjava/lang/Object;)V

    const/4 p0, 0x3

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/me/ThemeActivity;->updateTheme(I)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final getAdapterPostDelay()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/me/ThemeActivity;->adapterPostDelay:J

    return-wide v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 10

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1412f4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IX0iIX()Z

    move-result v1

    const-string v2, " -> id:"

    if-eqz v1, :cond_0

    const v0, 0x7f0a0097

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    if-eqz v3, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/ThemeActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/me/ThemeActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/ThemeActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {v3, v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPCAdListener;)V

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->IOi1O0()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0a008b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    if-eqz v3, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/ThemeActivity;->TAG:Ljava/lang/String;

    invoke-virtual {v3}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/me/ThemeActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/ThemeActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {v3, v0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->setAdListener(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->loadAdView$default(Lcom/sma/smartv3/view/ad/ADPAdContainerView;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public isThemeSelect(I)Z
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "SELECT_THEME"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v2
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d012b

    return v0
.end method

.method public onHandleBackPressed()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/ThemeActivity;->onTitleLeftClick(Landroid/view/View;)V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;-><init>(II)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gq5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gq5;-><init>(Lcom/sma/smartv3/ui/me/ThemeActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "SELECT_THEME"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result p1

    iget v0, p0, Lcom/sma/smartv3/ui/me/ThemeActivity;->nowTheme:I

    if-eq p1, v0, :cond_0

    const p1, 0x7f14115f

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    const-string p1, "THEME_CHANGE"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final setAdapterPostDelay(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/me/ThemeActivity;->adapterPostDelay:J

    return-void
.end method

.method public final updateTheme(I)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "SELECT_THEME"

    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object p1

    const-string v1, "brown_black"

    invoke-virtual {p1, v1, v2, v0}, Lcom/android/mltcode/paycertificationapi/ek4;->iOO1ii1(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/ek4$XIi00iiXO;I)Landroid/os/AsyncTask;

    return-void

    :cond_1
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object p1

    const-string v1, "light"

    invoke-virtual {p1, v1, v2, v0}, Lcom/android/mltcode/paycertificationapi/ek4;->iOO1ii1(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/ek4$XIi00iiXO;I)Landroid/os/AsyncTask;

    return-void

    :cond_2
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ek4;->IIX1OXO()Lcom/android/mltcode/paycertificationapi/ek4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/ek4;->O1O()V

    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setTheme()V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-ge p1, v0, :cond_4

    const p1, 0x7f141300

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :cond_4
    :goto_0
    return-void
.end method
