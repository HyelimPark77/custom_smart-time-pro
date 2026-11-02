.class public abstract Lcom/bestmafen/androidbase/list/BaseSimpleListActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/bestmafen/androidbase/list/BaseSimpleListActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/bestmafen/androidbase/list/BaseSimpleListActivity;->initView$lambda$0(Lcom/bestmafen/androidbase/list/BaseSimpleListActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/bestmafen/androidbase/list/BaseSimpleListActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lcom/bestmafen/androidbase/list/BaseSimpleListActivity;->onItemClick(ILjava/lang/Object;)V

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

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/ug6;",
            "TT;I)V"
        }
    .end annotation

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/ug6;->XIi00iiXO()Landroid/view/View;

    move-result-object p1

    const-string p3, "null cannot be cast to non-null type android.widget.TextView"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iXOO0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iXOO0;-><init>(Lcom/bestmafen/androidbase/list/BaseSimpleListActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x1090003

    return v0
.end method

.method public layoutId()I
    .locals 1

    sget v0, Lcom/bestmafen/androidbase/R$layout;->activity_list:I

    return v0
.end method

.method public abstract onItemClick(ILjava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation
.end method
