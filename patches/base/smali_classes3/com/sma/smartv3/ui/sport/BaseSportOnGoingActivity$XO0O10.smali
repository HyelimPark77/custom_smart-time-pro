.class public final Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/SlideLockView$iO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSlideLockView()Lcom/sma/smartv3/view/SlideLockView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/SlideLockView;->XiOIii1()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportRunPanel()Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getScreenLockRl()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/XO0O10;->O001I()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->enableBottomSheet()V

    :cond_0
    return-void
.end method
