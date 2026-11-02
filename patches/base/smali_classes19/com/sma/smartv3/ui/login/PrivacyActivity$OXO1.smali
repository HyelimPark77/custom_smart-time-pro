.class public final Lcom/sma/smartv3/ui/login/PrivacyActivity$OXO1;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/login/PrivacyActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/login/PrivacyActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/login/PrivacyActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/PrivacyActivity$OXO1;->IO:Lcom/sma/smartv3/ui/login/PrivacyActivity;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PrivacyActivity$OXO1;->IO:Lcom/sma/smartv3/ui/login/PrivacyActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/login/PrivacyActivity;->access$getMContext(Lcom/sma/smartv3/ui/login/PrivacyActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i72;->iIi011O(Landroid/app/Activity;)V

    return-void
.end method
