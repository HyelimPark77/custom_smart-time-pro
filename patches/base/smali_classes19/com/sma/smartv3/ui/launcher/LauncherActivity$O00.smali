.class public final Lcom/sma/smartv3/ui/launcher/LauncherActivity$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/view/GifImageView$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/launcher/LauncherActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/launcher/LauncherActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/launcher/LauncherActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity$O00;->OXO1:Lcom/sma/smartv3/ui/launcher/LauncherActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/launcher/LauncherActivity$O00;->OXO1:Lcom/sma/smartv3/ui/launcher/LauncherActivity;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->iI()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/ui/launcher/LauncherActivity;->access$delayGo(Lcom/sma/smartv3/ui/launcher/LauncherActivity;J)V

    return-void
.end method
