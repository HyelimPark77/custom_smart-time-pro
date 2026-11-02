.class public final Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic I1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/telephony/SubscriptionInfo;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic IO:Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;",
            "Ljava/util/List<",
            "Landroid/telephony/SubscriptionInfo;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity$OXO1;->I1:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;

    iget-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity$OXO1;->I1:Ljava/util/List;

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/telephony/SubscriptionInfo;

    invoke-virtual {p2}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result p2

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->access$setSubId$p(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;->access$getSubId$p(Lcom/sma/smartv3/ui/me/DeveloperSmsTestActivity;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
