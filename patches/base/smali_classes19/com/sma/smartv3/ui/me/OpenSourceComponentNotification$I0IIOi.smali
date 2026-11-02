.class public final Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$I0IIOi;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$I0IIOi;->IO:Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification$I0IIOi;->IO:Lcom/sma/smartv3/ui/me/OpenSourceComponentNotification;

    const-string v0, "https://github.com/google/gson"

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/X1OOO;->i010I(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
